import {useState} from "react";
import {useNavigate} from "react-router-dom";

export default function ServerList() {
    //ToDo: servers = [('server1', server1Id), ('server2', server2Id)]
    const [servers, setServers] = useState<string[]>([])

    const navigate = useNavigate();

    const fetchServers = async () => {
        const requestOptions = {
            method: 'GET',
        };

        try {
            const apiUrl = import.meta.env.VITE_API_URL;
            const response = await fetch(apiUrl + '/servers', requestOptions);
            const json = await response.json();
            if(json.success) {
                setServers(json.servers);
            } else {
                console.log(json.message);
            }
        } catch (error) {
            console.error('Error:', error);
        }
    }

    return (
        <div className="server-list">
            { servers.map((server, index) => {
                return (
                    <div key={index} className="server" onClick={navigate('/map')}>
                        <p>{server}</p>
                    </div>
                );
            })}
        </div>
    );
}