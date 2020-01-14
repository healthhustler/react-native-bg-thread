
# react-native-bg-thread

## Getting started

`$ npm install --save react-native-bg-thread`

### Linking

#### iOS
	1. 	Add pod 'react-native-bg-thread', :path => '../node_modules/react-native-bg-thread/react-native-bg-thread.podspec' to your pod file under targets
		Run following commands
	2. 	cd ios
	3. 	pod install

#### Android
	No further action needed

## Usage
```javascript
import RnBgTask from 'react-native-bg-thread';

	componentDidMount(){
		RnBgTask.runInBackground(()=>{
			// your js code here
		})
	}

```


