            package io.flutter.embedding.engine.dart;

            import android.content.res.AssetManager;
            import io.flutter.FlutterInjector;
            import io.flutter.Log;
            import io.flutter.embedding.engine.FlutterJNI;
            import io.flutter.embedding.engine.loader.FlutterLoader;
            import io.flutter.plugin.common.BinaryMessenger;
            import io.flutter.plugin.common.StringCodec;
            import io.flutter.util.TraceSection;
            import io.flutter.view.FlutterCallbackInformation;
            import java.nio.ByteBuffer;
            import java.util.List;
            import p000.C1951n4;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 4 */     public class DartExecutor implements BinaryMessenger {
                private static final String TAG = "DartExecutor";
                private final AssetManager assetManager;
                private final BinaryMessenger binaryMessenger;
                private final DartMessenger dartMessenger;
                private final long engineId;
                private final FlutterJNI flutterJNI;
                private boolean isApplicationRunning;
                private final BinaryMessenger.BinaryMessageHandler isolateChannelMessageHandler;
                private String isolateServiceId;
                private IsolateServiceIdListener isolateServiceIdListener;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class DartCallback {
                    public final AssetManager androidAssetManager;
                    public final FlutterCallbackInformation callbackHandle;
                    public final String pathToBundle;

                    public DartCallback(AssetManager assetManager, String str, FlutterCallbackInformation flutterCallbackInformation) {
/* 4 */                 this.androidAssetManager = assetManager;
/* 6 */                 this.pathToBundle = str;
/* 8 */                 this.callbackHandle = flutterCallbackInformation;
                    }

                    public String toString() {
/* 5 */                 StringBuilder sb = new StringBuilder("DartCallback( bundle path: ");
/* 10 */                sb.append(this.pathToBundle);
/* 15 */                sb.append(", library path: ");
/* 22 */                sb.append(this.callbackHandle.callbackLibraryPath);
/* 27 */                sb.append(", function: ");
/* 36 */                return fm0.m3789o(sb, this.callbackHandle.callbackName, " )");
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface IsolateServiceIdListener {
                    void onIsolateServiceIdAvailable(String str);
                }

                public DartExecutor(FlutterJNI flutterJNI, AssetManager assetManager, long j) {
/* 5 */             this.isApplicationRunning = false;
/* 9 */             BinaryMessenger.BinaryMessageHandler binaryMessageHandler = new BinaryMessenger.BinaryMessageHandler() { // from class: io.flutter.embedding.engine.dart.DartExecutor.1
                        @Override // io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler
                        public void onMessage(ByteBuffer byteBuffer, BinaryMessenger.BinaryReply binaryReply) {
/* 1 */                     DartExecutor.this.isolateServiceId = StringCodec.INSTANCE.decodeMessage(byteBuffer);
/* 18 */                    if (DartExecutor.this.isolateServiceIdListener != null) {
/* 32 */                        DartExecutor.this.isolateServiceIdListener.onIsolateServiceIdAvailable(DartExecutor.this.isolateServiceId);
                            }
                        }
                    };
/* 12 */            this.isolateChannelMessageHandler = binaryMessageHandler;
/* 14 */            this.flutterJNI = flutterJNI;
/* 16 */            this.assetManager = assetManager;
/* 18 */            this.engineId = j;
/* 22 */            DartMessenger dartMessenger = new DartMessenger(flutterJNI);
/* 25 */            this.dartMessenger = dartMessenger;
/* 29 */            dartMessenger.setMessageHandler("flutter/isolate", binaryMessageHandler);
/* 38 */            this.binaryMessenger = new DefaultBinaryMessenger(dartMessenger);
/* 44 */            if (flutterJNI.isAttached()) {
/* 47 */                this.isApplicationRunning = true;
                    }
                }

                @Override // io.flutter.plugin.common.BinaryMessenger
                @Deprecated
                public void disableBufferingIncomingMessages() {
/* 3 */             this.dartMessenger.disableBufferingIncomingMessages();
                }

                @Override // io.flutter.plugin.common.BinaryMessenger
                @Deprecated
                public void enableBufferingIncomingMessages() {
/* 3 */             this.dartMessenger.enableBufferingIncomingMessages();
                }

                public void executeDartCallback(DartCallback dartCallback) {
/* 7 */             if (this.isApplicationRunning) {
/* 11 */                Log.m4591w(TAG, "Attempted to run a DartExecutor that is already running.");
/* 14 */                return;
                    }
/* 17 */            TraceSection traceSectionScoped = TraceSection.scoped("DartExecutor#executeDartCallback");
                    try {
/* 33 */                Log.m4589v(TAG, "Executing Dart callback: " + dartCallback);
/* 36 */                FlutterJNI flutterJNI = this.flutterJNI;
/* 38 */                String str = dartCallback.pathToBundle;
/* 40 */                FlutterCallbackInformation flutterCallbackInformation = dartCallback.callbackHandle;
/* 51 */                flutterJNI.runBundleAndSnapshotFromLibrary(str, flutterCallbackInformation.callbackName, flutterCallbackInformation.callbackLibraryPath, dartCallback.androidAssetManager, null, this.engineId);
/* 55 */                this.isApplicationRunning = true;
/* 57 */                if (traceSectionScoped != null) {
/* 59 */                    traceSectionScoped.close();
                        }
                    } catch (Throwable th) {
/* 65 */                if (traceSectionScoped == null) {
/* 76 */                    throw th;
                        }
                        try {
/* 67 */                    traceSectionScoped.close();
/* 76 */                    throw th;
                        } catch (Throwable th2) {
/* 73 */                    th.addSuppressed(th2);
/* 76 */                    throw th;
                        }
                    }
                }

                public void executeDartEntrypoint(DartEntrypoint dartEntrypoint, List<String> list) {
/* 7 */             if (this.isApplicationRunning) {
/* 11 */                Log.m4591w(TAG, "Attempted to run a DartExecutor that is already running.");
/* 14 */                return;
                    }
/* 17 */            TraceSection traceSectionScoped = TraceSection.scoped("DartExecutor#executeDartEntrypoint");
                    try {
/* 33 */                Log.m4589v(TAG, "Executing Dart entrypoint: " + dartEntrypoint);
/* 49 */                this.flutterJNI.runBundleAndSnapshotFromLibrary(dartEntrypoint.pathToBundle, dartEntrypoint.dartEntrypointFunctionName, dartEntrypoint.dartEntrypointLibrary, this.assetManager, list, this.engineId);
/* 53 */                this.isApplicationRunning = true;
/* 55 */                if (traceSectionScoped != null) {
/* 57 */                    traceSectionScoped.close();
                        }
                    } catch (Throwable th) {
/* 63 */                if (traceSectionScoped == null) {
/* 74 */                    throw th;
                        }
                        try {
/* 65 */                    traceSectionScoped.close();
/* 74 */                    throw th;
                        } catch (Throwable th2) {
/* 71 */                    th.addSuppressed(th2);
/* 74 */                    throw th;
                        }
                    }
                }

                public BinaryMessenger getBinaryMessenger() {
/* 1 */             return this.binaryMessenger;
                }

                public String getIsolateServiceId() {
/* 1 */             return this.isolateServiceId;
                }

                public int getPendingChannelResponseCount() {
/* 3 */             return this.dartMessenger.getPendingChannelResponseCount();
                }

                public boolean isExecutingDart() {
/* 1 */             return this.isApplicationRunning;
                }

                @Override // io.flutter.plugin.common.BinaryMessenger
                @Deprecated
                public BinaryMessenger.TaskQueue makeBackgroundTaskQueue(BinaryMessenger.TaskQueueOptions taskQueueOptions) {
/* 3 */             return this.binaryMessenger.makeBackgroundTaskQueue(taskQueueOptions);
                }

                public void notifyLowMemoryWarning() {
/* 7 */             if (this.flutterJNI.isAttached()) {
/* 11 */                this.flutterJNI.notifyLowMemoryWarning();
                    }
                }

                public void onAttachedToJNI() {
/* 5 */             Log.m4589v(TAG, "Attached to JNI. Registering the platform message handler for this Dart execution context.");
/* 12 */            this.flutterJNI.setPlatformMessageHandler(this.dartMessenger);
                }

                public void onDetachedFromJNI() {
/* 5 */             Log.m4589v(TAG, "Detached from JNI. De-registering the platform message handler for this Dart execution context.");
/* 11 */            this.flutterJNI.setPlatformMessageHandler(null);
                }

                @Override // io.flutter.plugin.common.BinaryMessenger
                @Deprecated
                public void send(String str, ByteBuffer byteBuffer) {
/* 3 */             this.binaryMessenger.send(str, byteBuffer);
                }

                public void setIsolateServiceIdListener(IsolateServiceIdListener isolateServiceIdListener) {
                    String str;
/* 1 */             this.isolateServiceIdListener = isolateServiceIdListener;
/* 3 */             if (isolateServiceIdListener == null || (str = this.isolateServiceId) == null) {
/* 12 */                return;
                    }
/* 9 */             isolateServiceIdListener.onIsolateServiceIdAvailable(str);
                }

                @Override // io.flutter.plugin.common.BinaryMessenger
                @Deprecated
                public void setMessageHandler(String str, BinaryMessenger.BinaryMessageHandler binaryMessageHandler) {
/* 3 */             this.binaryMessenger.setMessageHandler(str, binaryMessageHandler);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 5 */         public static class DefaultBinaryMessenger implements BinaryMessenger {
                    private final DartMessenger messenger;

                    private DefaultBinaryMessenger(DartMessenger dartMessenger) {
/* 4 */                 this.messenger = dartMessenger;
                    }

                    @Override // io.flutter.plugin.common.BinaryMessenger
                    public void disableBufferingIncomingMessages() {
/* 3 */                 this.messenger.disableBufferingIncomingMessages();
                    }

                    @Override // io.flutter.plugin.common.BinaryMessenger
                    public void enableBufferingIncomingMessages() {
/* 3 */                 this.messenger.enableBufferingIncomingMessages();
                    }

                    @Override // io.flutter.plugin.common.BinaryMessenger
                    public BinaryMessenger.TaskQueue makeBackgroundTaskQueue(BinaryMessenger.TaskQueueOptions taskQueueOptions) {
/* 3 */                 return this.messenger.makeBackgroundTaskQueue(taskQueueOptions);
                    }

                    @Override // io.flutter.plugin.common.BinaryMessenger
                    public void send(String str, ByteBuffer byteBuffer) {
/* 4 */                 this.messenger.send(str, byteBuffer, null);
                    }

                    @Override // io.flutter.plugin.common.BinaryMessenger
                    public void setMessageHandler(String str, BinaryMessenger.BinaryMessageHandler binaryMessageHandler) {
/* 3 */                 this.messenger.setMessageHandler(str, binaryMessageHandler);
                    }

                    @Override // io.flutter.plugin.common.BinaryMessenger
/* 6 */             public void setMessageHandler(String str, BinaryMessenger.BinaryMessageHandler binaryMessageHandler, BinaryMessenger.TaskQueue taskQueue) {
/* 7 */                 this.messenger.setMessageHandler(str, binaryMessageHandler, taskQueue);
                    }

                    @Override // io.flutter.plugin.common.BinaryMessenger
/* 7 */             public void send(String str, ByteBuffer byteBuffer, BinaryMessenger.BinaryReply binaryReply) {
/* 8 */                 this.messenger.send(str, byteBuffer, binaryReply);
                    }
                }

                @Override // io.flutter.plugin.common.BinaryMessenger
                @Deprecated
/* 6 */         public void send(String str, ByteBuffer byteBuffer, BinaryMessenger.BinaryReply binaryReply) {
/* 7 */             this.binaryMessenger.send(str, byteBuffer, binaryReply);
                }

                @Override // io.flutter.plugin.common.BinaryMessenger
                @Deprecated
/* 6 */         public void setMessageHandler(String str, BinaryMessenger.BinaryMessageHandler binaryMessageHandler, BinaryMessenger.TaskQueue taskQueue) {
/* 7 */             this.binaryMessenger.setMessageHandler(str, binaryMessageHandler, taskQueue);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 10 */        public static class DartEntrypoint {
                    public final String dartEntrypointFunctionName;
                    public final String dartEntrypointLibrary;
                    public final String pathToBundle;

                    public DartEntrypoint(String str, String str2) {
/* 4 */                 this.pathToBundle = str;
/* 7 */                 this.dartEntrypointLibrary = null;
/* 9 */                 this.dartEntrypointFunctionName = str2;
                    }

                    public static DartEntrypoint createDefault() {
/* 5 */                 FlutterLoader flutterLoader = FlutterInjector.instance().flutterLoader();
/* 13 */                if (flutterLoader.initialized()) {
/* 23 */                    return new DartEntrypoint(flutterLoader.findAppBundlePath(), "main");
                        }
/* 29 */                C1951n4.m6856g("DartEntrypoints can only be created once a FlutterEngine is created.");
/* 32 */                return null;
                    }

                    public boolean equals(Object obj) {
/* 1 */                 if (this == obj) {
/* 3 */                     return true;
                        }
/* 6 */                 if (obj == null || getClass() != obj.getClass()) {
/* 5 */                     return false;
                        }
/* 19 */                DartEntrypoint dartEntrypoint = (DartEntrypoint) obj;
/* 29 */                if (this.pathToBundle.equals(dartEntrypoint.pathToBundle)) {
/* 36 */                    return this.dartEntrypointFunctionName.equals(dartEntrypoint.dartEntrypointFunctionName);
                        }
/* 5 */                 return false;
                    }

                    public int hashCode() {
/* 15 */                return this.dartEntrypointFunctionName.hashCode() + (this.pathToBundle.hashCode() * 31);
                    }

                    public String toString() {
/* 5 */                 StringBuilder sb = new StringBuilder("DartEntrypoint( bundle path: ");
/* 10 */                sb.append(this.pathToBundle);
/* 15 */                sb.append(", function: ");
/* 22 */                return fm0.m3789o(sb, this.dartEntrypointFunctionName, " )");
                    }

/* 11 */            public DartEntrypoint(String str, String str2, String str3) {
/* 13 */                this.pathToBundle = str;
/* 14 */                this.dartEntrypointLibrary = str2;
/* 15 */                this.dartEntrypointFunctionName = str3;
                    }
                }

/* 49 */        public DartExecutor(FlutterJNI flutterJNI, AssetManager assetManager) {
/* 50 */            this(flutterJNI, assetManager, 0L);
                }

/* 74 */        public void executeDartEntrypoint(DartEntrypoint dartEntrypoint) {
/* 75 */            executeDartEntrypoint(dartEntrypoint, null);
                }
            }
