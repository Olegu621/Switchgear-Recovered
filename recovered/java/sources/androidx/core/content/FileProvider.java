            package androidx.core.content;

            import android.content.ContentProvider;
            import android.content.ContentValues;
            import android.content.Context;
            import android.content.pm.ProviderInfo;
            import android.content.res.XmlResourceParser;
            import android.database.Cursor;
            import android.database.MatrixCursor;
            import android.net.Uri;
            import android.os.Bundle;
            import android.os.Environment;
            import android.os.ParcelFileDescriptor;
            import android.text.TextUtils;
            import android.webkit.MimeTypeMap;
            import io.sentry.android.core.performance.C1259g;
            import java.io.File;
            import java.io.FileNotFoundException;
            import java.io.IOException;
            import java.util.HashMap;
            import java.util.Map;
            import org.xmlpull.v1.XmlPullParserException;
            import p000.AbstractC0886en;
            import p000.C1951n4;
            import p000.lh0;
            import p000.mh0;
            import p000.nh0;
            import p000.s80;
            import p000.v00;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 6 */     public class FileProvider extends ContentProvider {
                private static final String ATTR_NAME = "name";
                private static final String ATTR_PATH = "path";
                private static final String DISPLAYNAME_FIELD = "displayName";
                private static final String META_DATA_FILE_PROVIDER_PATHS = "android.support.FILE_PROVIDER_PATHS";
                private static final String TAG_CACHE_PATH = "cache-path";
                private static final String TAG_EXTERNAL = "external-path";
                private static final String TAG_EXTERNAL_CACHE = "external-cache-path";
                private static final String TAG_EXTERNAL_FILES = "external-files-path";
                private static final String TAG_EXTERNAL_MEDIA = "external-media-path";
                private static final String TAG_FILES_PATH = "files-path";
                private static final String TAG_ROOT_PATH = "root-path";
                private String mAuthority;
                private mh0 mLocalPathStrategy;
                private final Object mLock;
                private final int mResourceId;
                private static final String[] COLUMNS = {"_display_name", "_size"};
                private static final File DEVICE_ROOT = new File("/");
                private static final HashMap<String, mh0> sCache = new HashMap<>();

                public FileProvider(int i) {
/* 9 */             this.mLock = new Object();
/* 11 */            this.mResourceId = i;
                }

                private static File buildPath(File file, String... strArr) {
/* 3 */             for (String str : strArr) {
/* 7 */                 if (str != null) {
/* 11 */                    file = new File(file, str);
                        }
                    }
/* 18 */            return file;
                }

                private static String[] copyOf(String[] strArr, int i) {
/* 1 */             String[] strArr2 = new String[i];
/* 4 */             System.arraycopy(strArr, 0, strArr2, 0, i);
/* 7 */             return strArr2;
                }

                public static XmlResourceParser getFileProviderPathsMetaData(Context context, String str, ProviderInfo providerInfo, int i) {
/* 2 */             if (providerInfo == null) {
/* 46 */                C1951n4.m6859j(AbstractC0886en.m3507k("Couldn't find meta-data for provider with authority ", str));
/* 1 */                 return null;
                    }
/* 8 */             if (providerInfo.metaData == null && i != 0) {
/* 15 */                Bundle bundle = new Bundle(1);
/* 18 */                providerInfo.metaData = bundle;
/* 20 */                bundle.putInt(META_DATA_FILE_PROVIDER_PATHS, i);
                    }
/* 27 */            XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), META_DATA_FILE_PROVIDER_PATHS);
/* 31 */            if (xmlResourceParserLoadXmlMetaData != null) {
/* 33 */                return xmlResourceParserLoadXmlMetaData;
                    }
/* 36 */            C1951n4.m6859j("Missing android.support.FILE_PROVIDER_PATHS meta-data");
/* 1 */             return null;
                }

                private mh0 getLocalPathStrategy() {
                    mh0 mh0Var;
                    synchronized (this.mLock) {
                        try {
/* 8 */                     if (this.mAuthority == null) {
/* 40 */                        throw new NullPointerException("mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                            }
/* 12 */                    if (this.mLocalPathStrategy == null) {
/* 26 */                        this.mLocalPathStrategy = getPathStrategy(getContext(), this.mAuthority, this.mResourceId);
                            }
/* 31 */                    mh0Var = this.mLocalPathStrategy;
                        } catch (Throwable th) {
/* 42 */                    throw th;
                        }
                    }
/* 34 */            return mh0Var;
                }

                private static mh0 getPathStrategy(Context context, String str, int i) {
                    mh0 pathStrategy;
/* 1 */             HashMap<String, mh0> map = sCache;
                    synchronized (map) {
                        try {
/* 4 */                     pathStrategy = map.get(str);
/* 10 */                    if (pathStrategy == null) {
                                try {
                                    try {
/* 12 */                                pathStrategy = parsePathStrategy(context, str, i);
/* 16 */                                map.put(str, pathStrategy);
                                    } catch (IOException e) {
/* 39 */                                throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                                    }
                                } catch (XmlPullParserException e2) {
/* 30 */                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                                }
                            }
                        } catch (Throwable th) {
/* 43 */                    throw th;
                        }
                    }
/* 41 */            return pathStrategy;
                }

                public static Uri getUriForFile(Context context, String str, File file) {
/* 6 */             nh0 nh0Var = (nh0) getPathStrategy(context, str, 0);
/* 8 */             nh0Var.getClass();
                    try {
/* 12 */                String canonicalPath = file.getCanonicalPath();
/* 26 */                Map.Entry entry = null;
/* 31 */                for (Map.Entry entry2 : nh0Var.f14268b.entrySet()) {
/* 45 */                    String path = ((File) entry2.getValue()).getPath();
/* 53 */                    if (nh0.m6977a(canonicalPath, path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
/* 77 */                        entry = entry2;
                            }
                        }
/* 79 */                if (entry == null) {
/* 184 */                   C1951n4.m6859j(AbstractC0886en.m3507k("Failed to find configured root that contains ", canonicalPath));
/* 11 */                    return null;
                        }
/* 87 */                String path2 = ((File) entry.getValue()).getPath();
/* 173 */               return new Uri.Builder().scheme("content").authority(nh0Var.f14267a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
                    } catch (IOException unused) {
/* 190 */               s80.m8430k(file, "Failed to resolve canonical path for ");
/* 11 */                return null;
                    }
                }

                private static int modeToMode(String str) {
/* 7 */             if ("r".equals(str)) {
/* 9 */                 return 268435456;
                    }
/* 18 */            if ("w".equals(str) || "wt".equals(str)) {
/* 73 */                return 738197504;
                    }
/* 35 */            if ("wa".equals(str)) {
/* 37 */                return 704643072;
                    }
/* 46 */            if ("rw".equals(str)) {
/* 48 */                return 939524096;
                    }
/* 57 */            if ("rwt".equals(str)) {
/* 59 */                return 1006632960;
                    }
/* 68 */            C1951n4.m6859j(AbstractC0886en.m3507k("Invalid mode: ", str));
/* 71 */            return 0;
                }

                /* JADX WARN: Code duplicated, block: B:34:0x0097  */
                private static mh0 parsePathStrategy(Context context, String str, int i) throws XmlPullParserException, IOException {
                    File externalStorageDirectory;
/* 3 */             nh0 nh0Var = new nh0(str);
/* 16 */            XmlResourceParser fileProviderPathsMetaData = getFileProviderPathsMetaData(context, str, context.getPackageManager().resolveContentProvider(str, 128), i);
                    while (true) {
/* 20 */                int next = fileProviderPathsMetaData.next();
/* 25 */                if (next == 1) {
/* 207 */                   return nh0Var;
                        }
/* 28 */                if (next == 2) {
/* 30 */                    String name = fileProviderPathsMetaData.getName();
/* 37 */                    String attributeValue = fileProviderPathsMetaData.getAttributeValue(null, ATTR_NAME);
/* 43 */                    String attributeValue2 = fileProviderPathsMetaData.getAttributeValue(null, ATTR_PATH);
/* 53 */                    if (TAG_ROOT_PATH.equals(name)) {
/* 55 */                        externalStorageDirectory = DEVICE_ROOT;
                            } else if (TAG_FILES_PATH.equals(name)) {
/* 66 */                        externalStorageDirectory = context.getFilesDir();
                            } else if (TAG_CACHE_PATH.equals(name)) {
/* 79 */                        externalStorageDirectory = context.getCacheDir();
                            } else if (TAG_EXTERNAL.equals(name)) {
/* 92 */                        externalStorageDirectory = Environment.getExternalStorageDirectory();
                            } else if (TAG_EXTERNAL_FILES.equals(name)) {
/* 106 */                       File[] externalFilesDirs = v00.getExternalFilesDirs(context, null);
/* 111 */                       if (externalFilesDirs.length > 0) {
/* 113 */                           externalStorageDirectory = externalFilesDirs[0];
                                } else {
/* 152 */                           externalStorageDirectory = null;
                                }
                            } else if (TAG_EXTERNAL_CACHE.equals(name)) {
/* 124 */                       File[] externalCacheDirs = v00.getExternalCacheDirs(context);
/* 129 */                       if (externalCacheDirs.length > 0) {
/* 131 */                           externalStorageDirectory = externalCacheDirs[0];
                                } else {
/* 152 */                           externalStorageDirectory = null;
                                }
                            } else if (TAG_EXTERNAL_MEDIA.equals(name)) {
/* 142 */                       File[] fileArrM6432a = lh0.m6432a(context);
/* 147 */                       if (fileArrM6432a.length > 0) {
/* 149 */                           externalStorageDirectory = fileArrM6432a[0];
                                } else {
/* 152 */                           externalStorageDirectory = null;
                                }
                            } else {
/* 152 */                       externalStorageDirectory = null;
                            }
/* 153 */                   if (externalStorageDirectory != null) {
/* 159 */                       File fileBuildPath = buildPath(externalStorageDirectory, attributeValue2);
/* 167 */                       if (TextUtils.isEmpty(attributeValue)) {
/* 203 */                           C1951n4.m6859j("Name must not be empty");
/* 36 */                            return null;
                                }
                                try {
/* 175 */                           nh0Var.f14268b.put(attributeValue, fileBuildPath.getCanonicalFile());
                                } catch (IOException e) {
/* 200 */                           throw new IllegalArgumentException("Failed to resolve canonical path for " + fileBuildPath, e);
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static String removeTrailingSlash(String str) {
                    return (str.length() <= 0 || str.charAt(str.length() + (-1)) != '/') ? str : str.substring(0, str.length() - 1);
                }

                @Override // android.content.ContentProvider
                public void attachInfo(Context context, ProviderInfo providerInfo) {
/* 1 */             super.attachInfo(context, providerInfo);
/* 6 */             if (providerInfo.exported) {
/* 58 */                throw new SecurityException("Provider must not be exported");
                    }
/* 10 */            if (!providerInfo.grantUriPermissions) {
/* 50 */                throw new SecurityException("Provider must grant uri permissions");
                    }
/* 21 */            String str = providerInfo.authority.split(";")[0];
                    synchronized (this.mLock) {
/* 26 */                this.mAuthority = str;
                    }
/* 29 */            HashMap<String, mh0> map = sCache;
                    synchronized (map) {
/* 32 */                map.remove(str);
                    }
                }

                @Override // android.content.ContentProvider
                public int delete(Uri uri, String str, String[] strArr) {
                    return ((nh0) getLocalPathStrategy()).m6978b(uri).delete() ? 1 : 0;
                }

                @Override // android.content.ContentProvider
                public String getType(Uri uri) {
/* 7 */             File fileM6978b = ((nh0) getLocalPathStrategy()).m6978b(uri);
/* 17 */            int iLastIndexOf = fileM6978b.getName().lastIndexOf(46);
/* 21 */            if (iLastIndexOf < 0) {
/* 44 */                return "application/octet-stream";
                    }
/* 37 */            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileM6978b.getName().substring(iLastIndexOf + 1));
                    return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
                }

                @Override // android.content.ContentProvider
                public String getTypeAnonymous(Uri uri) {
/* 1 */             return "application/octet-stream";
                }

                @Override // android.content.ContentProvider
                public Uri insert(Uri uri, ContentValues contentValues) {
/* 8 */             throw new UnsupportedOperationException("No external inserts");
                }

                @Override // android.content.ContentProvider
                public boolean onCreate() {
/* 1 */             C1259g.m4908d(this);
/* 4 */             C1259g.m4909e(this);
/* 7 */             return true;
                }

                @Override // android.content.ContentProvider
                public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
/* 15 */            return ParcelFileDescriptor.open(((nh0) getLocalPathStrategy()).m6978b(uri), modeToMode(str));
                }

                @Override // android.content.ContentProvider
                public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
                    int i;
/* 7 */             File fileM6978b = ((nh0) getLocalPathStrategy()).m6978b(uri);
/* 13 */            String queryParameter = uri.getQueryParameter(DISPLAYNAME_FIELD);
/* 17 */            if (strArr == null) {
/* 19 */                strArr = COLUMNS;
                    }
/* 22 */            String[] strArr3 = new String[strArr.length];
/* 25 */            Object[] objArr = new Object[strArr.length];
/* 29 */            int i2 = 0;
/* 30 */            for (String str3 : strArr) {
/* 40 */                if ("_display_name".equals(str3)) {
/* 42 */                    strArr3[i2] = "_display_name";
/* 44 */                    i = i2 + 1;
/* 54 */                    objArr[i2] = queryParameter == null ? fileM6978b.getName() : queryParameter;
                        } else {
/* 64 */                    if ("_size".equals(str3)) {
/* 66 */                        strArr3[i2] = "_size";
/* 68 */                        i = i2 + 1;
/* 78 */                        objArr[i2] = Long.valueOf(fileM6978b.length());
                            }
                        }
/* 56 */                i2 = i;
                    }
/* 84 */            String[] strArrCopyOf = copyOf(strArr3, i2);
/* 88 */            Object[] objArrCopyOf = copyOf(objArr, i2);
/* 95 */            MatrixCursor matrixCursor = new MatrixCursor(strArrCopyOf, 1);
/* 98 */            matrixCursor.addRow(objArrCopyOf);
/* 101 */           return matrixCursor;
                }

                @Override // android.content.ContentProvider
                public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
/* 8 */             throw new UnsupportedOperationException("No external updates");
                }

/* 7 */         private static Object[] copyOf(Object[] objArr, int i) {
/* 8 */             Object[] objArr2 = new Object[i];
/* 9 */             System.arraycopy(objArr, 0, objArr2, 0, i);
                    return objArr2;
                }

/* 13 */        public FileProvider() {
/* 14 */            this(0);
                }

/* 193 */       public static Uri getUriForFile(Context context, String str, File file, String str2) {
/* 195 */           return getUriForFile(context, str, file).buildUpon().appendQueryParameter(DISPLAYNAME_FIELD, str2).build();
                }
            }
