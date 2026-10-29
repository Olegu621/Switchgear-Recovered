            package io.flutter.embedding.engine.loader;

            import android.content.pm.PackageInfo;
            import android.content.pm.PackageManager;
            import android.content.res.AssetManager;
            import android.os.AsyncTask;
            import android.os.Build;
            import io.flutter.Log;
            import io.sentry.config.AbstractC1417a;
            import java.io.File;
            import java.io.FileNotFoundException;
            import java.io.FileOutputStream;
            import java.io.FilenameFilter;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.OutputStream;
            import java.util.Collection;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.ExecutionException;
            import okhttp3.internal.http2.Http2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class ResourceExtractor {
                private static final String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
                private static final String TAG = "ResourceExtractor";
                private static final String TIMESTAMP_PREFIX = "res_timestamp-";
                private final AssetManager mAssetManager;
                private final String mDataDirPath;
                private ExtractTask mExtractTask;
                private final PackageManager mPackageManager;
                private final String mPackageName;
                private final HashSet<String> mResources = new HashSet<>();

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class ExtractTask extends AsyncTask<Void, Void, Void> {
                    private final AssetManager mAssetManager;
                    private final String mDataDirPath;
                    private final PackageManager mPackageManager;
                    private final String mPackageName;
                    private final HashSet<String> mResources;

                    public ExtractTask(String str, HashSet<String> hashSet, String str2, PackageManager packageManager, AssetManager assetManager) {
/* 4 */                 this.mDataDirPath = str;
/* 6 */                 this.mResources = hashSet;
/* 8 */                 this.mAssetManager = assetManager;
/* 10 */                this.mPackageName = str2;
/* 12 */                this.mPackageManager = packageManager;
                    }

                    private boolean extractAPK(File file) {
/* 11 */                for (String str : this.mResources) {
                            try {
/* 21 */                        File file2 = new File(file, str);
/* 28 */                        if (!file2.exists()) {
/* 35 */                            if (file2.getParentFile() != null) {
/* 41 */                                file2.getParentFile().mkdirs();
                                    }
/* 49 */                            InputStream inputStreamOpen = this.mAssetManager.open(str);
                                    try {
/* 58 */                                FileOutputStream fileOutputStreamM5167e = AbstractC1417a.m5167e(new FileOutputStream(file2), file2);
                                        try {
/* 1 */                                     ResourceExtractor.copy(inputStreamOpen, fileOutputStreamM5167e);
/* 65 */                                    fileOutputStreamM5167e.close();
/* 68 */                                    if (inputStreamOpen != null) {
/* 70 */                                        inputStreamOpen.close();
                                            }
                                        } catch (Throwable th) {
                                            try {
/* 77 */                                        fileOutputStreamM5167e.close();
                                            } catch (Throwable th2) {
/* 82 */                                        th.addSuppressed(th2);
                                            }
/* 85 */                                    throw th;
                                        }
                                    } catch (Throwable th3) {
/* 86 */                                if (inputStreamOpen != null) {
                                            try {
/* 88 */                                        inputStreamOpen.close();
                                            } catch (Throwable th4) {
/* 93 */                                        th3.addSuppressed(th4);
                                            }
                                        }
/* 96 */                                throw th3;
                                    }
                                }
                            } catch (FileNotFoundException unused) {
                                continue;
                            } catch (IOException e) {
/* 117 */                       Log.m4591w(ResourceExtractor.TAG, "Exception unpacking resources: " + e.getMessage());
/* 1 */                         ResourceExtractor.deleteFiles(this.mDataDirPath, this.mResources);
/* 127 */                       return false;
                            }
                        }
/* 129 */               return true;
                    }

                    @Override // android.os.AsyncTask
                    public Void doInBackground(Void... voidArr) {
/* 5 */                 File file = new File(this.mDataDirPath);
/* 1 */                 String strCheckTimestamp = ResourceExtractor.checkTimestamp(file, this.mPackageManager, this.mPackageName);
/* 17 */                if (strCheckTimestamp == null) {
/* 16 */                    return null;
                        }
/* 1 */                 ResourceExtractor.deleteFiles(this.mDataDirPath, this.mResources);
/* 31 */                if (!extractAPK(file)) {
/* 16 */                    return null;
                        }
                        try {
/* 39 */                    new File(file, strCheckTimestamp).createNewFile();
                        } catch (IOException unused) {
/* 47 */                    Log.m4591w(ResourceExtractor.TAG, "Failed to write resource timestamp");
                        }
/* 16 */                return null;
                    }
                }

                public ResourceExtractor(String str, String str2, PackageManager packageManager, AssetManager assetManager) {
/* 4 */             this.mDataDirPath = str;
/* 6 */             this.mPackageName = str2;
/* 8 */             this.mPackageManager = packageManager;
/* 10 */            this.mAssetManager = assetManager;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static String checkTimestamp(File file, PackageManager packageManager, String str) {
                    try {
/* 4 */                 PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
/* 8 */                 if (packageInfo == null) {
/* 1 */                     return TIMESTAMP_PREFIX;
                        }
/* 33 */                String str2 = TIMESTAMP_PREFIX + getVersionCode(packageInfo) + "-" + packageInfo.lastUpdateTime;
/* 37 */                String[] existingTimestamps = getExistingTimestamps(file);
/* 41 */                if (existingTimestamps != null && existingTimestamps.length == 1 && str2.equals(existingTimestamps[0])) {
/* 57 */                    return null;
                        }
/* 59 */                return str2;
                    } catch (PackageManager.NameNotFoundException unused) {
/* 1 */                 return TIMESTAMP_PREFIX;
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static void copy(InputStream inputStream, OutputStream outputStream) throws IOException {
/* 3 */             byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
                    while (true) {
/* 5 */                 int i = inputStream.read(bArr);
/* 9 */                 if (i < 0) {
/* 16 */                    return;
                        } else {
/* 12 */                    outputStream.write(bArr, 0, i);
                        }
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static void deleteFiles(String str, HashSet<String> hashSet) {
/* 3 */             File file = new File(str);
/* 6 */             Iterator<String> it = hashSet.iterator();
/* 14 */            while (it.hasNext()) {
/* 24 */                File file2 = new File(file, it.next());
/* 31 */                if (file2.exists()) {
/* 33 */                    file2.delete();
                        }
                    }
/* 37 */            String[] existingTimestamps = getExistingTimestamps(file);
/* 41 */            if (existingTimestamps == null) {
/* 61 */                return;
                    }
/* 46 */            for (String str2 : existingTimestamps) {
/* 55 */                new File(file, str2).delete();
                    }
                }

                private static String[] getExistingTimestamps(File file) {
/* 6 */             return file.list(new FilenameFilter() { // from class: io.flutter.embedding.engine.loader.ResourceExtractor.1
                        @Override // java.io.FilenameFilter
                        public boolean accept(File file2, String str) {
/* 3 */                     return str.startsWith(ResourceExtractor.TIMESTAMP_PREFIX);
                        }
                    });
                }

                public static long getVersionCode(PackageInfo packageInfo) {
                    return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
                }

                public ResourceExtractor addResource(String str) {
/* 3 */             this.mResources.add(str);
/* 6 */             return this;
                }

                public ResourceExtractor addResources(Collection<String> collection) {
/* 3 */             this.mResources.addAll(collection);
/* 6 */             return this;
                }

                public ResourceExtractor start() {
/* 13 */            ExtractTask extractTask = new ExtractTask(this.mDataDirPath, this.mResources, this.mPackageName, this.mPackageManager, this.mAssetManager);
/* 16 */            this.mExtractTask = extractTask;
/* 23 */            extractTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
/* 26 */            return this;
                }

                public void waitForCompletion() {
/* 1 */             ExtractTask extractTask = this.mExtractTask;
/* 3 */             if (extractTask == null) {
/* 5 */                 return;
                    }
                    try {
/* 6 */                 extractTask.get();
                    } catch (InterruptedException | CancellationException | ExecutionException unused) {
/* 14 */                deleteFiles(this.mDataDirPath, this.mResources);
                    }
                }
            }
