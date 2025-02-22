module.exports = {
  content: ["./src/**/*.{html,ts}"],
  darkMode: false,
  theme: {
    extend: {
      colors: {
        "custom-orange": "#E63946",
      },
    },
  },
  variants: {
    extend: {},
  },
  plugins: [require("@tailwindcss/forms")],
};
