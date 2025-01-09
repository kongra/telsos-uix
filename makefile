dev:
	@npm run dev

release:
	@npm run release

clean:
	@rm -rf public/js/
	@rm -f  public/main.css
	@rm -rf .cpcache/

clj-kondo:
	@clj-kondo --config .clj-kondo/config.edn --lint  src/

cloc:
	@cloc . --exclude-list-file=cloc.excluded
