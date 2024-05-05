const path = require('path');

module.exports = {
    mode: "development",
    devtool: 'cheap-module-source-map',
    entry: {
        'themify-settings': path.join(__dirname, "settings", "index.jsx"),
    },
    output: {
        library: ['@themify', '[name]'],
        libraryTarget: 'window',
        filename: '[name].js',
        chunkFilename: '[name].chunk.js',
        path: path.join(__dirname, '..', 'src', 'main', 'resources', 'js')
    },
    module: {
        rules: [
            {
                test: /\.?jsx$/,
                exclude: /node_modules/,
                use: {
                    loader: "babel-loader",
                    options: {
                        presets: [
                            '@babel/preset-env',
                            ['@babel/preset-react', { "runtime": "automatic" }]
                        ]
                    }
                },
            },
        ]
    },
    resolve: {
        extensions: ['', '.js', '.jsx'],
    }
}