# taurus performance testing example (todo)


# Installation 
- [Windows](https://gettaurus.org/builds/TaurusInstaller_1.14.2_x64.exe) but, i prefer to install via PIP

		pip install --upgrade pip wheel
		pip install bzt
		

- Ubuntu 

		sudo apt-get update && sudo apt-get install -y python3 default-jre-headless python3-tk python3-pip python3-dev libxml2-dev libxslt-dev zlib1g-dev net-tools
		sudo python3 -m pip install bzt
		
		
# Main Project [link](https://gettaurus.org/)

# CLI Options 

	Usage: bzt [options] [configs] [-aliases]

	BlazeMeter Taurus Tool v1.14.2, the configuration-driven test running engine

	Options:
	  -h, --help            show this help message and exit
	  -l LOG, --log=LOG     Log file location
	  -o OPTION, --option=OPTION
							Override option in config
	  -q, --quiet           Only errors and warnings printed to console
	  -v, --verbose         Prints all logging messages to console
	  -n, --no-system-configs
							Skip system and user config files