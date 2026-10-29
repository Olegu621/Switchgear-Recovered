            package io.flutter.embedding.engine.deferredcomponents;

            import android.content.Context;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.PackageManager;
            import android.os.Build;
            import android.os.Bundle;
            import android.util.SparseArray;
            import android.util.SparseIntArray;
            import com.google.android.play.core.splitinstall.SplitInstallException;
            import com.google.android.play.core.splitinstall.SplitInstallManager;
            import com.google.android.play.core.splitinstall.SplitInstallManagerFactory;
            import com.google.android.play.core.splitinstall.SplitInstallRequest;
            import com.google.android.play.core.splitinstall.SplitInstallSessionState;
            import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;
            import io.flutter.Log;
            import io.flutter.embedding.engine.FlutterJNI;
            import io.flutter.embedding.engine.loader.ApplicationInfoLoader;
            import io.flutter.embedding.engine.loader.FlutterApplicationInfo;
            import io.flutter.embedding.engine.systemchannels.DeferredComponentChannel;
            import java.io.File;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedList;
            import java.util.Map;
            import okhttp3.HttpUrl;
            import p000.ds0;
            import p000.et1;
            import p000.fm0;
            import p000.ft1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class PlayStoreDeferredComponentManager implements DeferredComponentManager {
                public static final String MAPPING_KEY = DeferredComponentManager.class.getName().concat(".loadingUnitMapping");
                private static final String TAG = "PlayStoreDeferredComponentManager";
                private DeferredComponentChannel channel;
                private Context context;
                private FlutterApplicationInfo flutterApplicationInfo;
                private FlutterJNI flutterJNI;
                private FeatureInstallStateUpdatedListener listener;
                protected SparseArray<String> loadingUnitIdToComponentNames;
                protected SparseArray<String> loadingUnitIdToSharedLibraryNames;
                private Map<String, Integer> nameToSessionId;
                private SparseIntArray sessionIdToLoadingUnitId;
                private SparseArray<String> sessionIdToName;
                private SparseArray<String> sessionIdToState;
                private SplitInstallManager splitInstallManager;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public class FeatureInstallStateUpdatedListener implements SplitInstallStateUpdatedListener {
                    private FeatureInstallStateUpdatedListener() {
                    }

                    public void onStateUpdate(SplitInstallSessionState splitInstallSessionState) {
/* 1 */                 int iSessionId = splitInstallSessionState.sessionId();
/* 15 */                if (PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId) != null) {
                            switch (splitInstallSessionState.status()) {
                                case 1:
/* 637 */                           Log.m4583d(PlayStoreDeferredComponentManager.TAG, String.format("Module \"%s\" (sessionId %d) install pending.", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId), Integer.valueOf(iSessionId)));
/* 648 */                           PlayStoreDeferredComponentManager.this.sessionIdToState.put(iSessionId, "pending");
                                    break;
                                case 2:
/* 598 */                           Log.m4583d(PlayStoreDeferredComponentManager.TAG, String.format("Module \"%s\" (sessionId %d) downloading.", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId), Integer.valueOf(iSessionId)));
/* 609 */                           PlayStoreDeferredComponentManager.this.sessionIdToState.put(iSessionId, "downloading");
                                    break;
                                case 3:
/* 559 */                           Log.m4583d(PlayStoreDeferredComponentManager.TAG, String.format("Module \"%s\" (sessionId %d) downloaded.", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId), Integer.valueOf(iSessionId)));
/* 570 */                           PlayStoreDeferredComponentManager.this.sessionIdToState.put(iSessionId, "downloaded");
                                    break;
                                case 4:
/* 520 */                           Log.m4583d(PlayStoreDeferredComponentManager.TAG, String.format("Module \"%s\" (sessionId %d) installing.", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId), Integer.valueOf(iSessionId)));
/* 531 */                           PlayStoreDeferredComponentManager.this.sessionIdToState.put(iSessionId, "installing");
                                    break;
                                case 5:
/* 372 */                           Log.m4583d(PlayStoreDeferredComponentManager.TAG, String.format("Module \"%s\" (sessionId %d) install successfully.", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId), Integer.valueOf(iSessionId)));
/* 375 */                           PlayStoreDeferredComponentManager playStoreDeferredComponentManager = PlayStoreDeferredComponentManager.this;
/* 397 */                           playStoreDeferredComponentManager.loadAssets(playStoreDeferredComponentManager.sessionIdToLoadingUnitId.get(iSessionId), (String) PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId));
/* 410 */                           if (PlayStoreDeferredComponentManager.this.sessionIdToLoadingUnitId.get(iSessionId) > 0) {
/* 412 */                               PlayStoreDeferredComponentManager playStoreDeferredComponentManager2 = PlayStoreDeferredComponentManager.this;
/* 434 */                               playStoreDeferredComponentManager2.loadDartLibrary(playStoreDeferredComponentManager2.sessionIdToLoadingUnitId.get(iSessionId), (String) PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId));
                                    }
/* 443 */                           if (PlayStoreDeferredComponentManager.this.channel != null) {
/* 463 */                               PlayStoreDeferredComponentManager.this.channel.completeInstallSuccess((String) PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId));
                                    }
/* 472 */                           PlayStoreDeferredComponentManager.this.sessionIdToName.delete(iSessionId);
/* 481 */                           PlayStoreDeferredComponentManager.this.sessionIdToLoadingUnitId.delete(iSessionId);
/* 492 */                           PlayStoreDeferredComponentManager.this.sessionIdToState.put(iSessionId, "installed");
                                    break;
                                case 6:
/* 246 */                           Log.m4585e(PlayStoreDeferredComponentManager.TAG, String.format("Module \"%s\" (sessionId %d) install failed with: %s", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId), Integer.valueOf(iSessionId), Integer.valueOf(splitInstallSessionState.errorCode())));
/* 284 */                           PlayStoreDeferredComponentManager.this.flutterJNI.deferredComponentInstallFailure(PlayStoreDeferredComponentManager.this.sessionIdToLoadingUnitId.get(iSessionId), "Module install failed with " + splitInstallSessionState.errorCode(), true);
/* 293 */                           if (PlayStoreDeferredComponentManager.this.channel != null) {
/* 315 */                               PlayStoreDeferredComponentManager.this.channel.completeInstallError((String) PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId), "Android Deferred Component failed to install.");
                                    }
/* 324 */                           PlayStoreDeferredComponentManager.this.sessionIdToName.delete(iSessionId);
/* 333 */                           PlayStoreDeferredComponentManager.this.sessionIdToLoadingUnitId.delete(iSessionId);
/* 344 */                           PlayStoreDeferredComponentManager.this.sessionIdToState.put(iSessionId, "failed");
                                    break;
                                case 7:
/* 150 */                           Log.m4583d(PlayStoreDeferredComponentManager.TAG, String.format("Module \"%s\" (sessionId %d) install canceled.", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId), Integer.valueOf(iSessionId)));
/* 159 */                           if (PlayStoreDeferredComponentManager.this.channel != null) {
/* 181 */                               PlayStoreDeferredComponentManager.this.channel.completeInstallError((String) PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId), "Android Deferred Component installation canceled.");
                                    }
/* 190 */                           PlayStoreDeferredComponentManager.this.sessionIdToName.delete(iSessionId);
/* 199 */                           PlayStoreDeferredComponentManager.this.sessionIdToLoadingUnitId.delete(iSessionId);
/* 210 */                           PlayStoreDeferredComponentManager.this.sessionIdToState.put(iSessionId, "cancelled");
                                    break;
                                case 8:
/* 111 */                           Log.m4583d(PlayStoreDeferredComponentManager.TAG, String.format("Module \"%s\" (sessionId %d) install requires user confirmation.", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId), Integer.valueOf(iSessionId)));
/* 122 */                           PlayStoreDeferredComponentManager.this.sessionIdToState.put(iSessionId, "requiresUserConfirmation");
                                    break;
                                case 9:
/* 72 */                            Log.m4583d(PlayStoreDeferredComponentManager.TAG, String.format("Module \"%s\" (sessionId %d) install canceling.", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId), Integer.valueOf(iSessionId)));
/* 83 */                            PlayStoreDeferredComponentManager.this.sessionIdToState.put(iSessionId, "canceling");
                                    break;
                                default:
/* 44 */                            Log.m4583d(PlayStoreDeferredComponentManager.TAG, "Unknown status: " + splitInstallSessionState.status());
                                    break;
                            }
                        }
                    }
                }

                public PlayStoreDeferredComponentManager(Context context, FlutterJNI flutterJNI) {
/* 4 */             this.context = context;
/* 6 */             this.flutterJNI = flutterJNI;
/* 12 */            this.flutterApplicationInfo = ApplicationInfoLoader.load(context);
/* 18 */            this.splitInstallManager = SplitInstallManagerFactory.create(context);
/* 23 */            FeatureInstallStateUpdatedListener featureInstallStateUpdatedListener = new FeatureInstallStateUpdatedListener();
/* 26 */            this.listener = featureInstallStateUpdatedListener;
/* 30 */            this.splitInstallManager.registerListener(featureInstallStateUpdatedListener);
/* 38 */            this.sessionIdToName = new SparseArray<>();
/* 45 */            this.sessionIdToLoadingUnitId = new SparseIntArray();
/* 52 */            this.sessionIdToState = new SparseArray<>();
/* 59 */            this.nameToSessionId = new HashMap();
/* 66 */            this.loadingUnitIdToComponentNames = new SparseArray<>();
/* 73 */            this.loadingUnitIdToSharedLibraryNames = new SparseArray<>();
/* 75 */            initLoadingUnitMappingToComponentNames();
                }

                private ApplicationInfo getApplicationInfo() {
                    try {
/* 15 */                return this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), 128);
                    } catch (PackageManager.NameNotFoundException e) {
/* 21 */                ds0.m3199p(e);
/* 24 */                return null;
                    }
                }

                private void initLoadingUnitMappingToComponentNames() {
                    Bundle bundle;
/* 1 */             ApplicationInfo applicationInfo = getApplicationInfo();
/* 5 */             if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
/* 102 */               return;
                    }
/* 11 */            String str = MAPPING_KEY;
/* 14 */            String string = bundle.getString(str, null);
/* 18 */            if (string == null) {
/* 41 */                Log.m4585e(TAG, "No loading unit to dynamic feature module name found. Ensure '" + str + "' is defined in the base module's AndroidManifest.");
/* 44 */                return;
                    }
/* 51 */            if (string.equals(HttpUrl.FRAGMENT_ENCODE_SET)) {
/* 102 */               return;
                    }
/* 63 */            for (String str2 : string.split(",")) {
/* 70 */                String[] strArrSplit = str2.split(":", -1);
/* 76 */                int i = Integer.parseInt(strArrSplit[0]);
/* 85 */                this.loadingUnitIdToComponentNames.put(i, strArrSplit[1]);
/* 90 */                if (strArrSplit.length > 2) {
/* 96 */                    this.loadingUnitIdToSharedLibraryNames.put(i, strArrSplit[2]);
                        }
                    }
                }

                private /* synthetic */ void lambda$installDeferredComponent$0(String str, int i, Integer num) {
/* 7 */             this.sessionIdToName.put(num.intValue(), str);
/* 16 */            this.sessionIdToLoadingUnitId.put(num.intValue(), i);
/* 25 */            if (this.nameToSessionId.containsKey(str)) {
/* 41 */                this.sessionIdToState.remove(this.nameToSessionId.get(str).intValue());
                    }
/* 46 */            this.nameToSessionId.put(str, num);
/* 57 */            this.sessionIdToState.put(num.intValue(), "Requested");
                }

                private /* synthetic */ void lambda$installDeferredComponent$1(int i, String str, Exception exc) {
/* 1 */             SplitInstallException splitInstallException = (SplitInstallException) exc;
/* 3 */             int errorCode = splitInstallException.getErrorCode();
/* 10 */            if (errorCode == -6) {
/* 63 */                this.flutterJNI.deferredComponentInstallFailure(i, fm0.m3784j("Install of deferred component module \"", str, "\" failed with a network error"), true);
/* 66 */                return;
                    }
/* 12 */            FlutterJNI flutterJNI = this.flutterJNI;
/* 16 */            if (errorCode != -2) {
/* 40 */                flutterJNI.deferredComponentInstallFailure(i, String.format("Install of deferred component module \"%s\" failed with error %d: %s", str, Integer.valueOf(splitInstallException.getErrorCode()), splitInstallException.getMessage()), false);
                    } else {
/* 50 */                flutterJNI.deferredComponentInstallFailure(i, fm0.m3784j("Install of deferred component module \"", str, "\" failed as it is unavailable"), false);
                    }
                }

                private boolean verifyJNI() {
/* 3 */             if (this.flutterJNI != null) {
/* 14 */                return true;
                    }
/* 9 */             Log.m4585e(TAG, "No FlutterJNI provided. `setJNI` must be called on the DeferredComponentManager before attempting to load dart libraries or invoking with platform channels.");
/* 12 */            return false;
                }

                @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
                public void destroy() {
/* 5 */             this.splitInstallManager.unregisterListener(this.listener);
/* 9 */             this.channel = null;
/* 11 */            this.flutterJNI = null;
                }

                @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
                public String getDeferredComponentInstallState(int i, String str) {
/* 1 */             if (str == null) {
/* 6 */                 str = this.loadingUnitIdToComponentNames.get(i);
                    }
/* 15 */            if (str == null) {
/* 21 */                Log.m4585e(TAG, "Deferred component name was null and could not be resolved from loading unit id.");
/* 13 */                return "unknown";
                    }
/* 31 */            if (this.nameToSessionId.containsKey(str)) {
/* 63 */                return this.sessionIdToState.get(this.nameToSessionId.get(str).intValue());
                    }
                    return this.splitInstallManager.getInstalledModules().contains(str) ? "installedPendingLoad" : "unknown";
                }

                @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
                public void installDeferredComponent(int i, String str) {
/* 1 */             if (str == null) {
/* 6 */                 str = this.loadingUnitIdToComponentNames.get(i);
                    }
/* 12 */            if (str == null) {
/* 18 */                Log.m4585e(TAG, "Deferred component name was null and could not be resolved from loading unit id.");
                    } else if (str.equals(HttpUrl.FRAGMENT_ENCODE_SET) && i > 0) {
/* 32 */                loadDartLibrary(i, str);
                    } else {
/* 68 */                this.splitInstallManager.startInstall(SplitInstallRequest.newBuilder().addModule(str).build()).addOnSuccessListener(new et1()).addOnFailureListener(new ft1());
                    }
                }

                @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
                public void loadAssets(int i, String str) {
/* 5 */             if (verifyJNI()) {
                        try {
/* 8 */                     Context context = this.context;
/* 15 */                    Context contextCreatePackageContext = context.createPackageContext(context.getPackageName(), 0);
/* 19 */                    this.context = contextCreatePackageContext;
/* 31 */                    this.flutterJNI.updateJavaAssetManager(contextCreatePackageContext.getAssets(), this.flutterApplicationInfo.flutterAssetsDir);
                        } catch (PackageManager.NameNotFoundException e) {
/* 36 */                    ds0.m3199p(e);
                        }
                    }
                }

                @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
                public void loadDartLibrary(int i, String str) {
/* 5 */             if (verifyJNI() && i >= 0) {
/* 13 */                String str2 = this.loadingUnitIdToSharedLibraryNames.get(i);
/* 21 */                if (str2 == null) {
/* 46 */                    str2 = this.flutterApplicationInfo.aotSharedLibraryName + "-" + i + ".part.so";
                        }
/* 53 */                String str3 = Build.SUPPORTED_ABIS[0];
/* 57 */                String strReplace = str3.replace("-", "_");
/* 63 */                ArrayList arrayList = new ArrayList();
/* 68 */                ArrayList arrayList2 = new ArrayList();
/* 73 */                LinkedList linkedList = new LinkedList();
/* 82 */                linkedList.add(this.context.getFilesDir());
/* 95 */                for (String str4 : this.context.getApplicationInfo().splitSourceDirs) {
/* 104 */                   linkedList.add(new File(str4));
                        }
/* 114 */               while (!linkedList.isEmpty()) {
/* 120 */                   File file = (File) linkedList.remove();
/* 122 */                   if (file == null || !file.isDirectory() || file.listFiles() == null) {
/* 152 */                       String name = file.getName();
/* 162 */                       if (name.endsWith(".apk") && ((name.startsWith(str) || name.startsWith("split_config")) && name.contains(strReplace))) {
/* 188 */                           arrayList.add(file.getAbsolutePath());
                                } else if (name.equals(str2)) {
/* 202 */                           arrayList2.add(file.getAbsolutePath());
                                }
                            } else {
/* 142 */                       for (File file2 : file.listFiles()) {
/* 146 */                           linkedList.add(file2);
                                }
                            }
                        }
/* 208 */               ArrayList arrayList3 = new ArrayList();
/* 211 */               arrayList3.add(str2);
/* 214 */               Iterator it = arrayList.iterator();
/* 222 */               while (it.hasNext()) {
/* 258 */                   arrayList3.add(((String) it.next()) + "!lib/" + str3 + "/" + str2);
                        }
/* 262 */               Iterator it2 = arrayList2.iterator();
/* 270 */               while (it2.hasNext()) {
/* 278 */                   arrayList3.add((String) it2.next());
                        }
/* 296 */               this.flutterJNI.loadDartDeferredLibrary(i, (String[]) arrayList3.toArray(new String[arrayList3.size()]));
                    }
                }

                @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
                public void setDeferredComponentChannel(DeferredComponentChannel deferredComponentChannel) {
/* 1 */             this.channel = deferredComponentChannel;
                }

                @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
                public void setJNI(FlutterJNI flutterJNI) {
/* 1 */             this.flutterJNI = flutterJNI;
                }

                @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
                public boolean uninstallDeferredComponent(int i, String str) {
/* 1 */             if (str == null) {
/* 6 */                 str = this.loadingUnitIdToComponentNames.get(i);
                    }
/* 13 */            if (str == null) {
/* 19 */                Log.m4585e(TAG, "Deferred component name was null and could not be resolved from loading unit id.");
/* 22 */                return false;
                    }
/* 26 */            ArrayList arrayList = new ArrayList();
/* 29 */            arrayList.add(str);
/* 34 */            this.splitInstallManager.deferredUninstall(arrayList);
/* 43 */            if (this.nameToSessionId.get(str) == null) {
/* 62 */                return true;
                    }
/* 59 */            this.sessionIdToState.delete(this.nameToSessionId.get(str).intValue());
/* 62 */            return true;
                }
            }
