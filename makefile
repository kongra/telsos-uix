dev:
	@npm run dev

css:
	@npx @tailwindcss/cli -i ./src/css/main.css -o public/css/main.css --watch

release:
	@npm run release
	@npx @tailwindcss/cli -i ./src/css/main.css -o public/css/main.css --minify

clean:
	@rm -rf public/js/
	@rm -f  public/css/main.css
	@rm -rf .cpcache/

clean-all:
	@rm -rf public/js/
	@rm -f  public/css/main.css
	@rm -rf .cpcache/
	@rm -rf node_modules/
	@rm -rf .shadow-cljs/

clj-kondo:
	@clj-kondo --config .clj-kondo/config.edn --lint  src/

cloc:
	@cloc . --exclude-list-file=cloc.excluded
