import Nav from "../nav/Nav";

const routes = [
  {
    path: "/",
    element: <Nav />,
    children: [
      { index: true, element: "" },
      {
        path: "logs",
        element: "",
      },
    ],
  },
];

export default routes;
