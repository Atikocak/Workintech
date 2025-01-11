import { Link } from "react-router-dom";
import { navbar } from "./data/navData.json";

export default function Navbar() {
  return (
    <nav className="mx-auto max-w-4xl leading-8 text-dark-gray">
      <ul className="my-3 grid grid-flow-row grid-cols-2 justify-between gap-x-10 gap-y-4 px-20 py-7 font-quattrocento text-base sm:my-3 sm:flex sm:w-full sm:gap-1 sm:p-2">
        {navbar.map((item) => (
          <div key={item.id}>
            <Link to="/#">
              <li className="flex items-center gap-2 rounded-full px-5 py-3 font-barlow transition duration-300 hover:bg-dark-gray hover:text-white">
                <img
                  loading="lazy"
                  src={item.imageUrl}
                  alt="navbar-logo"
                  className="aspect-square w-6 shrink-0"
                />
                <span className="my-auto">{item.name}</span>
              </li>
            </Link>
          </div>
        ))}
      </ul>
    </nav>
  );
}
