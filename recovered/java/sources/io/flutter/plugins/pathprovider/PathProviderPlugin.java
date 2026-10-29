            package io.flutter.plugins.pathprovider;

            import android.content.Context;
            import io.flutter.embedding.engine.plugins.FlutterPlugin;
            import io.flutter.plugin.common.BinaryMessenger;
            import io.flutter.util.PathUtils;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.File;
            import java.util.ArrayList;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class PathProviderPlugin implements FlutterPlugin, Messages.PathProviderApi {
                static final String TAG = "PathProviderPlugin";
                private Context context;

                /* JADX INFO: renamed from: io.flutter.plugins.pathprovider.PathProviderPlugin$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static /* synthetic */ class C11171 {

                    /* JADX INFO: renamed from: $SwitchMap$io$flutter$plugins$pathprovider$Messages$StorageDirectory */
                    static final /* synthetic */ int[] f9773x64ce01e6;

                    static {
/* 6 */                 int[] iArr = new int[Messages.StorageDirectory.values().length];
/* 8 */                 f9773x64ce01e6 = iArr;
                        try {
/* 17 */                    iArr[Messages.StorageDirectory.ROOT.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
/* 28 */                    f9773x64ce01e6[Messages.StorageDirectory.MUSIC.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
/* 39 */                    f9773x64ce01e6[Messages.StorageDirectory.PODCASTS.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
/* 50 */                    f9773x64ce01e6[Messages.StorageDirectory.RINGTONES.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
/* 61 */                    f9773x64ce01e6[Messages.StorageDirectory.ALARMS.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        try {
/* 72 */                    f9773x64ce01e6[Messages.StorageDirectory.NOTIFICATIONS.ordinal()] = 6;
                        } catch (NoSuchFieldError unused6) {
                        }
                        try {
/* 83 */                    f9773x64ce01e6[Messages.StorageDirectory.PICTURES.ordinal()] = 7;
                        } catch (NoSuchFieldError unused7) {
                        }
                        try {
/* 95 */                    f9773x64ce01e6[Messages.StorageDirectory.MOVIES.ordinal()] = 8;
                        } catch (NoSuchFieldError unused8) {
                        }
                        try {
/* 107 */                   f9773x64ce01e6[Messages.StorageDirectory.DOWNLOADS.ordinal()] = 9;
                        } catch (NoSuchFieldError unused9) {
                        }
                        try {
/* 119 */                   f9773x64ce01e6[Messages.StorageDirectory.DCIM.ordinal()] = 10;
                        } catch (NoSuchFieldError unused10) {
                        }
                        try {
/* 131 */                   f9773x64ce01e6[Messages.StorageDirectory.DOCUMENTS.ordinal()] = 11;
                        } catch (NoSuchFieldError unused11) {
                        }
                    }
                }

                private void setUp(BinaryMessenger binaryMessenger, Context context) {
                    try {
/* 1 */                 Messages.PathProviderApi.setUp(binaryMessenger, this);
                    } catch (Exception e) {
/* 10 */                AbstractC1245n0.m4877e(TAG, "Received exception while setting up PathProviderPlugin", e);
                    }
/* 13 */            this.context = context;
                }

                @Override // io.flutter.plugins.pathprovider.Messages.PathProviderApi
                public String getApplicationCachePath() {
/* 7 */             return this.context.getCacheDir().getPath();
                }

                @Override // io.flutter.plugins.pathprovider.Messages.PathProviderApi
                public String getApplicationDocumentsPath() {
/* 3 */             return PathUtils.getDataDirectory(this.context);
                }

                @Override // io.flutter.plugins.pathprovider.Messages.PathProviderApi
                public String getApplicationSupportPath() {
/* 3 */             return PathUtils.getFilesDir(this.context);
                }

                @Override // io.flutter.plugins.pathprovider.Messages.PathProviderApi
                public List<String> getExternalCachePaths() {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 14 */            for (File file : this.context.getExternalCacheDirs()) {
/* 18 */                if (file != null) {
/* 24 */                    arrayList.add(file.getAbsolutePath());
                        }
                    }
/* 30 */            return arrayList;
                }

                @Override // io.flutter.plugins.pathprovider.Messages.PathProviderApi
                public String getExternalStoragePath() {
/* 4 */             File externalFilesDir = this.context.getExternalFilesDir(null);
/* 8 */             if (externalFilesDir == null) {
/* 3 */                 return null;
                    }
/* 11 */            return externalFilesDir.getAbsolutePath();
                }

                @Override // io.flutter.plugins.pathprovider.Messages.PathProviderApi
                public List<String> getExternalStoragePaths(Messages.StorageDirectory storageDirectory) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 18 */            for (File file : this.context.getExternalFilesDirs(getStorageDirectoryString(storageDirectory))) {
/* 22 */                if (file != null) {
/* 28 */                    arrayList.add(file.getAbsolutePath());
                        }
                    }
/* 34 */            return arrayList;
                }

                public String getStorageDirectoryString(Messages.StorageDirectory storageDirectory) {
                    switch (C11171.f9773x64ce01e6[storageDirectory.ordinal()]) {
                        case 1:
/* 62 */                    return null;
                        case 2:
/* 59 */                    return "music";
                        case 3:
/* 56 */                    return "podcasts";
                        case 4:
/* 53 */                    return "ringtones";
                        case 5:
/* 50 */                    return "alarms";
                        case 6:
/* 47 */                    return "notifications";
                        case 7:
/* 44 */                    return "pictures";
                        case 8:
/* 41 */                    return "movies";
                        case 9:
/* 38 */                    return "downloads";
                        case 10:
/* 35 */                    return "dcim";
                        case 11:
/* 32 */                    return "documents";
                        default:
/* 31 */                    throw new RuntimeException("Unrecognized directory: " + storageDirectory);
                    }
                }

                @Override // io.flutter.plugins.pathprovider.Messages.PathProviderApi
                public String getTemporaryPath() {
/* 7 */             return this.context.getCacheDir().getPath();
                }

                @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
                public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
/* 9 */             setUp(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext());
                }

                @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
                public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
/* 6 */             Messages.PathProviderApi.setUp(flutterPluginBinding.getBinaryMessenger(), null);
                }
            }
