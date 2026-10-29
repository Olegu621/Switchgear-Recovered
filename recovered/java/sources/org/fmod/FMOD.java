            package org.fmod;

            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.content.Intent;
            import android.content.IntentFilter;
            import android.content.res.AssetManager;
            import android.media.AudioDeviceCallback;
            import android.media.AudioDeviceInfo;
            import android.media.AudioManager;
            import android.net.Uri;
            import android.os.Build;
            import java.io.FileNotFoundException;
            import java.util.HashSet;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class FMOD {
                private static Context gContext;
                private static PluginAudioDeviceCallback gPluginAudioDeviceCallback;
                private static PluginBroadcastReceiver gPluginBroadcastReceiver = new PluginBroadcastReceiver();

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class PluginAudioDeviceCallback extends AudioDeviceCallback {
                    private static HashSet<Integer> deviceSet;

                    public PluginAudioDeviceCallback(AudioDeviceInfo[] audioDeviceInfoArr) {
/* 9 */                 deviceSet = new HashSet<>();
/* 11 */                if (audioDeviceInfoArr != null) {
/* 15 */                    for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
/* 29 */                        deviceSet.add(Integer.valueOf(audioDeviceInfo.getId()));
                            }
                        }
                    }

                    @Override // android.media.AudioDeviceCallback
                    public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                        boolean z;
/* 1 */                 int i = 0;
/* 2 */                 if (audioDeviceInfoArr != null) {
/* 4 */                     int i2 = 0;
/* 5 */                     z = false;
/* 7 */                     while (i < audioDeviceInfoArr.length) {
/* 25 */                        if (!deviceSet.contains(Integer.valueOf(audioDeviceInfoArr[i].getId()))) {
/* 34 */                            if (audioDeviceInfoArr[i].isSource()) {
/* 36 */                                i2 = 1;
                                    }
/* 43 */                            if (audioDeviceInfoArr[i].isSink()) {
/* 45 */                                z = true;
                                    }
/* 58 */                            deviceSet.add(Integer.valueOf(audioDeviceInfoArr[i].getId()));
                                }
/* 61 */                        i++;
                            }
/* 64 */                    i = i2;
                        } else {
/* 66 */                    z = false;
                        }
/* 67 */                if (i != 0) {
/* 1 */                     FMOD.SetInputEnumerationChanged();
                        }
/* 72 */                if (z) {
/* 1 */                     FMOD.SetOutputEnumerationChanged();
                        }
                    }

                    @Override // android.media.AudioDeviceCallback
                    public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                        boolean z;
/* 1 */                 int i = 0;
/* 2 */                 if (audioDeviceInfoArr != null) {
/* 4 */                     int i2 = 0;
/* 5 */                     z = false;
/* 7 */                     while (i < audioDeviceInfoArr.length) {
/* 25 */                        if (deviceSet.contains(Integer.valueOf(audioDeviceInfoArr[i].getId()))) {
/* 34 */                            if (audioDeviceInfoArr[i].isSource()) {
/* 36 */                                i2 = 1;
                                    }
/* 43 */                            if (audioDeviceInfoArr[i].isSink()) {
/* 45 */                                z = true;
                                    }
/* 58 */                            deviceSet.remove(Integer.valueOf(audioDeviceInfoArr[i].getId()));
                                }
/* 61 */                        i++;
                            }
/* 64 */                    i = i2;
                        } else {
/* 66 */                    z = false;
                        }
/* 67 */                if (i != 0) {
/* 1 */                     FMOD.SetInputEnumerationChanged();
                        }
/* 72 */                if (z) {
/* 1 */                     FMOD.SetOutputEnumerationChanged();
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class PluginBroadcastReceiver extends BroadcastReceiver {
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
/* 1 */                 FMOD.OutputAAudioHeadphonesChanged();
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static native void OutputAAudioHeadphonesChanged();

                /* JADX INFO: Access modifiers changed from: private */
                public static native void SetInputEnumerationChanged();

                /* JADX INFO: Access modifiers changed from: private */
                public static native void SetOutputEnumerationChanged();

                public static boolean checkInit() {
                    return gContext != null;
                }

                public static void close() {
/* 1 */             Context context = gContext;
/* 3 */             if (context != null) {
/* 7 */                 context.unregisterReceiver(gPluginBroadcastReceiver);
/* 22 */                ((AudioManager) gContext.getSystemService("audio")).unregisterAudioDeviceCallback(gPluginAudioDeviceCallback);
                    }
/* 26 */            gContext = null;
                }

                public static int fileDescriptorFromUri(String str) {
/* 4 */             if (gContext != null) {
                        try {
/* 22 */                    return gContext.getContentResolver().openFileDescriptor(Uri.parse(str), "r").detachFd();
                        } catch (FileNotFoundException unused) {
                        }
                    }
/* 3 */             return -1;
                }

                public static AssetManager getAssetManager() {
/* 1 */             Context context = gContext;
/* 3 */             if (context != null) {
/* 5 */                 return context.getAssets();
                    }
/* 10 */            return null;
                }

                public static AudioDeviceInfo[] getAudioDevices(int i) {
/* 1 */             Context context = gContext;
                    return context != null ? ((AudioManager) context.getSystemService("audio")).getDevices(i) : new AudioDeviceInfo[0];
                }

                public static int getOutputBlockSize() {
                    String property;
/* 1 */             Context context = gContext;
/* 3 */             if (context == null || (property = ((AudioManager) context.getSystemService("audio")).getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER")) == null) {
/* 26 */                return 0;
                    }
/* 21 */            return Integer.parseInt(property);
                }

                public static int getOutputSampleRate() {
                    String property;
/* 1 */             Context context = gContext;
/* 3 */             if (context == null || (property = ((AudioManager) context.getSystemService("audio")).getProperty("android.media.property.OUTPUT_SAMPLE_RATE")) == null) {
/* 26 */                return 0;
                    }
/* 21 */            return Integer.parseInt(property);
                }

                public static void init(Context context) {
/* 1 */             gContext = context;
/* 3 */             if (context != null) {
/* 9 */                 IntentFilter intentFilter = new IntentFilter("android.intent.action.HEADSET_PLUG");
/* 16 */                if (Build.VERSION.SDK_INT >= 34) {
/* 2 */                     gContext.registerReceiver(gPluginBroadcastReceiver, intentFilter, 4);
                        } else {
/* 30 */                    gContext.registerReceiver(gPluginBroadcastReceiver, intentFilter);
                        }
/* 41 */                AudioManager audioManager = (AudioManager) gContext.getSystemService("audio");
/* 50 */                PluginAudioDeviceCallback pluginAudioDeviceCallback = new PluginAudioDeviceCallback(audioManager.getDevices(3));
/* 53 */                gPluginAudioDeviceCallback = pluginAudioDeviceCallback;
/* 56 */                audioManager.registerAudioDeviceCallback(pluginAudioDeviceCallback, null);
                    }
                }

                public static boolean isBluetoothOn() {
/* 1 */             Context context = gContext;
/* 4 */             if (context == null) {
/* 3 */                 return false;
                    }
/* 12 */            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                    return audioManager.isBluetoothA2dpOn() || audioManager.isBluetoothScoOn();
                }

                public static boolean lowLatencyFlag() {
/* 1 */             Context context = gContext;
/* 3 */             if (context != null) {
/* 11 */                return context.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
                    }
/* 16 */            return false;
                }

                public static boolean proAudioFlag() {
/* 1 */             Context context = gContext;
/* 3 */             if (context != null) {
/* 11 */                return context.getPackageManager().hasSystemFeature("android.hardware.audio.pro");
                    }
/* 16 */            return false;
                }

                public static boolean supportsAAudio() {
                    return Build.VERSION.SDK_INT >= 27;
                }

                public static boolean supportsLowLatency() {
/* 1 */             int outputBlockSize = getOutputBlockSize();
/* 5 */             boolean zLowLatencyFlag = lowLatencyFlag();
/* 9 */             proAudioFlag();
                    return (outputBlockSize > 0 && outputBlockSize <= 1024) && zLowLatencyFlag && !isBluetoothOn();
                }
            }
