import {MouseEventHandler, useState} from "react";
import {useNavigate} from "react-router-dom";

export default function Navbar() {
    const [loggedIn, setLoggedIn] = useState<boolean>(false);
    const [usernameField, setUsernameField] = useState<string>("");
    const [passwordField, setPasswordField] = useState<string>("");

    const navigate = useNavigate();

    const apiUrl = import.meta.env.VITE_API_URL;

    const handleUsernameFieldChange = (event: React.ChangeEvent<HTMLInputElement>) => {
        setUsernameField(event.target.value);
    }

    const handlePasswordFieldChange = (event: React.ChangeEvent<HTMLInputElement>) => {
        setPasswordField(event.target.value);
    }

    const handleLogin: MouseEventHandler<HTMLButtonElement> = async (event) => {
        event.preventDefault();

        const requestOptions = {
            method: 'POST',
            headers: {
                'Content-Type': 'text/plain;charset=UTF-8',
            },
            body: JSON.stringify({
                username: usernameField,
                password: passwordField,
            }),
        };

        try {
            const response = await fetch(apiUrl + '/login', requestOptions);
            const json = await response.json();
            if(json.success) {
                setLoggedIn(true);
                navigate('/servers');
            } else {
                console.log(json.message);
                setUsernameField("");
                setPasswordField("");
            }
        } catch (error) {
            console.error('Error:', error);
            setUsernameField("");
            setPasswordField("");
        }
    }

    return (
        <>
            <div className="left">
                <p>TOGETHER WE FALL</p>
            </div>
                { loggedIn ? <p>Logged in as {usernameField}</p> :
                    <div className="right">
                        <input placeholder="Username" value={usernameField} onChange={handleUsernameFieldChange}/>
                        <input type="password" placeholder="Password" value={passwordField} onChange={handlePasswordFieldChange}/>
                        <button onClick={handleLogin}>Login</button>
                    </div>
                }
        </>
    );
}