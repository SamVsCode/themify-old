import React from 'react';
import ReactDOM from 'react-dom/client';
import { Settings } from './Settings';
console.log("adas");
export function renderSettings() {
    const root = ReactDOM.createRoot(document.getElementById("themify-root"));
    root.render(
        <React.StrictMode>
            <Settings />
        </React.StrictMode>
    );

}
