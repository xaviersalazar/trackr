import Nav from "../components/nav/Nav";
import Home from "../pages/Home";
import Logs from "../pages/Logs";

const routes = [
  {
    path: "/",
    element: <Nav />,
    children: [
      { index: true, element: <Home /> },
      {
        path: "logs",
        element: <Logs />,
      },
    ],
  },
];

export default routes;
