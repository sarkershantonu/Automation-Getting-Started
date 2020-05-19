# This is Gauge CLI basics



# Gauge CLI options 

	Usage:
	  gauge <command> [flags] [args]

	Examples:
	  gauge run specs/
	  gauge run --parallel specs/

	Commands:
	  config      Change global configurations
	  daemon      Run as a daemon
	  docs        Generate documentation using specified plugin
	  format      Formats the specified spec files
	  help        Help about any command
	  init        Initialize project structure in the current directory
	  install     Download and install plugin(s)
	  list        List specifications, scenarios or tags for a gauge project
	  refactor    Refactor steps
	  run         Run specs
	  telemetry   Configure options for sending anonymous usage stats
	  uninstall   Uninstalls a plugin
	  update      Updates a plugin
	  validate    Check for validation and parse errors
	  version     Print Gauge and plugin versions

	Flags:
	  -d, --dir string         Set the working directory for the current command, accepts a path relative to current directory (default ".")
	  -h, --help               Help for gauge
	  -l, --log-level string   Set level of logging to debug, info, warning, error or critical (default "info")
	  -m, --machine-readable   Prints output in JSON format
	  -v, --version            Print Gauge and plugin versions

	Use "gauge [command] --help" for more information about a command.
	Complete manual is available at https://manpage.gauge.org/.