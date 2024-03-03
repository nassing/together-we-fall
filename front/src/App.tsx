
import './sass/App.css'
import {Outlet, Route, Routes} from "react-router-dom";
import Home from "./components/Home.tsx";
import Register from "./components/Register.tsx";
import ServerList from "./components/ServerList.tsx";
import GameMap from "./components/GameMap.tsx";

export default function App() {
  return (
      <Routes>
          <Route path="/" element={ <Outlet /> }>
              <Route index element={ <Home />} />
              <Route path="register" element={ <Register /> } />
              <Route path="servers" element={ <ServerList /> } />
              <Route path="map/:gameId" element={ <GameMap /> } />
              <Route path="*" element={ <Home /> } />
          </Route>
      </Routes>
  )
}