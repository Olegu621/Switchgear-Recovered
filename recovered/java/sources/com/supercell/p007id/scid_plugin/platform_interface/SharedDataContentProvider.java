            package com.supercell.p007id.scid_plugin.platform_interface;

            import android.content.ContentProvider;
            import android.content.ContentResolver;
            import android.content.ContentValues;
            import android.content.Context;
            import android.content.UriMatcher;
            import android.database.Cursor;
            import android.database.MatrixCursor;
            import android.net.Uri;
            import android.os.Binder;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.supercell.p007id.scid_plugin.SharedDataStorage;
            import io.sentry.android.core.AbstractC1245n0;
            import io.sentry.android.core.performance.C1259g;
            import java.util.Objects;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.fm0;
            import p000.i13;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 %2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002JK\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\f2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u0010\u0017J\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J9\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0014\u001a\u0004\u0018\u00010\f2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0013H\u0016¢\u0006\u0002\u0010\u001dJ/\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\f2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0013H\u0016¢\u0006\u0002\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\fH\u0002J\b\u0010$\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000¨\u0006&"}, m6176d2 = {"Lcom/supercell/id/scid_plugin/platform_interface/SharedDataContentProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "sharedDataStorage", "Lcom/supercell/id/scid_plugin/SharedDataStorage;", "uriMatcher", "Landroid/content/UriMatcher;", "onCreate", HttpUrl.FRAGMENT_ENCODE_SET, "validateCaller", "callingPackage", HttpUrl.FRAGMENT_ENCODE_SET, "scidEnvironment", "query", "Landroid/database/Cursor;", "uri", "Landroid/net/Uri;", "projection", HttpUrl.FRAGMENT_ENCODE_SET, "selection", "selectionArgs", "sortOrder", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "insert", "values", "Landroid/content/ContentValues;", "update", HttpUrl.FRAGMENT_ENCODE_SET, "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "delete", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "getType", "createDataCursor", "key", FirebaseAnalytics.Param.VALUE, "createEmptyCursor", "Companion", "scid_plugin_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
/* 2 */     public final class SharedDataContentProvider extends ContentProvider {
                private static final String AUTHORITY_SUFFIX = ".id.shareddata";
                public static final String BASE_PATH = "data";
                public static final String COLUMN_SUCCESS = "success";

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                public static final String QUERY_PARAM_ENV = "env";
                public static final String SCHEME = "content";
                public static final String SHARED_ACCOUNTS_COLUMN_KEY = "shared_accounts_key";
                public static final String SHARED_ACCOUNTS_COLUMN_VALUE = "shared_accounts_value";
                public static final int SHARED_DATA_KEY = 2;
                private static final String TAG = "SharedDataContentProvider";
                private SharedDataStorage sharedDataStorage;
                private UriMatcher uriMatcher;

                private final Cursor createDataCursor(String key, String value) {
/* 13 */            MatrixCursor matrixCursor = new MatrixCursor(new String[]{SHARED_ACCOUNTS_COLUMN_KEY, SHARED_ACCOUNTS_COLUMN_VALUE, "success"});
/* 25 */            matrixCursor.addRow(new Object[]{key, value, 1});
/* 28 */            return matrixCursor;
                }

                private final Cursor createEmptyCursor() {
/* 13 */            return new MatrixCursor(new String[]{SHARED_ACCOUNTS_COLUMN_KEY, SHARED_ACCOUNTS_COLUMN_VALUE, "success"});
                }

                private final boolean validateCaller(String callingPackage, String scidEnvironment) {
/* 1 */             Context context = getContext();
/* 5 */             if (context == null) {
/* 7 */                 return false;
                    }
/* 17 */            if (Intrinsics.m6216a(callingPackage, context.getPackageName())) {
/* 19 */                return true;
                    }
/* 30 */            return new PackageValidation(context, callingPackage, scidEnvironment, Binder.getCallingUid()).isValid();
                }

                @Override // android.content.ContentProvider
                public int delete(Uri uri, String selection, String[] selectionArgs) throws Exception {
                    String lastPathSegment;
                    ContentResolver contentResolver;
/* 1 */             uri.getClass();
/* 4 */             String callingPackage = getCallingPackage();
/* 9 */             if (callingPackage == null) {
/* 11 */                Context context = getContext();
/* 22 */                callingPackage = context != null ? context.getPackageName() : null;
                    }
/* 24 */            if (callingPackage == null) {
/* 23 */                return 0;
                    }
/* 29 */            String queryParameter = uri.getQueryParameter(QUERY_PARAM_ENV);
                    try {
/* 33 */                UriMatcher uriMatcher = this.uriMatcher;
/* 35 */                if (uriMatcher == null) {
/* 97 */                    Intrinsics.m6220e("uriMatcher");
/* 100 */                   throw null;
                        }
/* 42 */                if (uriMatcher.match(uri) != 2 || (lastPathSegment = uri.getLastPathSegment()) == null || lastPathSegment.length() == 0 || !validateCaller(callingPackage, queryParameter)) {
/* 23 */                    return 0;
                        }
/* 64 */                SharedDataStorage sharedDataStorage = this.sharedDataStorage;
/* 66 */                if (sharedDataStorage == null) {
/* 90 */                    Intrinsics.m6220e("sharedDataStorage");
/* 93 */                    throw null;
                        }
/* 68 */                sharedDataStorage.putString(lastPathSegment, null);
/* 71 */                Context context2 = getContext();
/* 75 */                if (context2 == null || (contentResolver = context2.getContentResolver()) == null) {
/* 86 */                    return 1;
                        }
/* 83 */                contentResolver.notifyChange(uri, null);
/* 86 */                return 1;
                    } catch (Exception e) {
/* 106 */               AbstractC1245n0.m4877e(TAG, "Error in delete", e);
/* 109 */               throw e;
                    }
                }

                @Override // android.content.ContentProvider
                public String getType(Uri uri) {
/* 1 */             uri.getClass();
/* 4 */             UriMatcher uriMatcher = this.uriMatcher;
/* 7 */             if (uriMatcher == null) {
/* 38 */                Intrinsics.m6220e("uriMatcher");
/* 41 */                throw null;
                    }
/* 14 */            if (uriMatcher.match(uri) != 2) {
/* 6 */                 return null;
                    }
/* 16 */            Context context = getContext();
/* 30 */            return fm0.m3784j("vnd.android.cursor.item/vnd.", context != null ? context.getPackageName() : null, AUTHORITY_SUFFIX);
                }

                @Override // android.content.ContentProvider
                public Uri insert(Uri uri, ContentValues values) throws Exception {
/* 1 */             uri.getClass();
/* 4 */             String callingPackage = getCallingPackage();
/* 9 */             if (callingPackage == null) {
/* 11 */                Context context = getContext();
/* 22 */                callingPackage = context != null ? context.getPackageName() : null;
                    }
/* 23 */            if (callingPackage == null || values == null) {
/* 8 */                 return null;
                    }
/* 30 */            String queryParameter = uri.getQueryParameter(QUERY_PARAM_ENV);
                    try {
/* 36 */                String asString = values.getAsString(SHARED_ACCOUNTS_COLUMN_KEY);
/* 42 */                String asString2 = values.getAsString(SHARED_ACCOUNTS_COLUMN_VALUE);
/* 46 */                if (asString == null || asString.length() == 0 || !validateCaller(callingPackage, queryParameter)) {
/* 8 */                     return null;
                        }
/* 62 */                SharedDataStorage sharedDataStorage = this.sharedDataStorage;
/* 64 */                if (sharedDataStorage == null) {
/* 89 */                    Intrinsics.m6220e("sharedDataStorage");
/* 92 */                    throw null;
                        }
/* 66 */                sharedDataStorage.putString(asString, asString2);
/* 69 */                Companion companion = INSTANCE;
/* 71 */                Context context2 = getContext();
/* 75 */                context2.getClass();
/* 82 */                return Uri.withAppendedPath(companion.getContentUri(context2), asString);
                    } catch (Exception e) {
/* 99 */                AbstractC1245n0.m4877e(TAG, "Error in insert", e);
/* 102 */               throw e;
                    }
                }

                @Override // android.content.ContentProvider
                public boolean onCreate() throws Throwable {
/* 1 */             C1259g.m4908d(this);
/* 4 */             Context context = getContext();
/* 8 */             if (context == null) {
/* 42 */                C1259g.m4909e(this);
/* 45 */                return false;
                    }
/* 18 */            this.sharedDataStorage = SharedDataStorage.INSTANCE.getInstance(context);
/* 26 */            this.uriMatcher = INSTANCE.createUriMatcher(context);
/* 34 */            i13.m4419A(new C0785a(context, null));
/* 37 */            C1259g.m4909e(this);
/* 40 */            return true;
                }

                @Override // android.content.ContentProvider
                public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
/* 1 */             uri.getClass();
/* 4 */             Context context = getContext();
/* 9 */             if (context == null) {
/* 8 */                 return null;
                    }
/* 12 */            String callingPackage = getCallingPackage();
/* 16 */            if (callingPackage == null) {
/* 18 */                callingPackage = context.getPackageName();
                    }
/* 22 */            Objects.toString(uri);
/* 27 */            String queryParameter = uri.getQueryParameter(QUERY_PARAM_ENV);
/* 31 */            UriMatcher uriMatcher = this.uriMatcher;
/* 33 */            if (uriMatcher == null) {
/* 158 */               Intrinsics.m6220e("uriMatcher");
/* 161 */               throw null;
                    }
/* 42 */            if (uriMatcher.match(uri) != 2) {
/* 152 */               AbstractC1245n0.m4889q(TAG, "Unknown URI: " + uri);
/* 8 */                 return null;
                    }
/* 44 */            String lastPathSegment = uri.getLastPathSegment();
/* 48 */            if (lastPathSegment == null || lastPathSegment.length() == 0) {
/* 134 */               AbstractC1245n0.m4889q(TAG, "Key cannot be null or empty");
/* 8 */                 return null;
                    }
/* 57 */            callingPackage.getClass();
/* 64 */            if (!validateCaller(callingPackage, queryParameter)) {
/* 131 */               throw new SecurityException(AbstractC0886en.m3509m("Package validation failed for ", callingPackage, " in environment ", queryParameter));
                    }
                    try {
/* 66 */                SharedDataStorage sharedDataStorage = this.sharedDataStorage;
/* 68 */                if (sharedDataStorage != null) {
/* 70 */                    String string = sharedDataStorage.getString(lastPathSegment);
                            return (string == null || string.length() <= 0) ? createEmptyCursor() : createDataCursor(lastPathSegment, string);
                        }
/* 96 */                Intrinsics.m6220e("sharedDataStorage");
/* 99 */                throw null;
                    } catch (Exception e) {
/* 114 */               AbstractC1245n0.m4877e(TAG, "Storage error reading key: " + lastPathSegment, e);
/* 8 */                 return null;
                    }
                }

                @Override // android.content.ContentProvider
                public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
/* 1 */             uri.getClass();
                    return insert(uri, values) != null ? 1 : 0;
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u001a\u0010\u000e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m6176d2 = {"Lcom/supercell/id/scid_plugin/platform_interface/SharedDataContentProvider$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "<init>", "()V", "TAG", HttpUrl.FRAGMENT_ENCODE_SET, "BASE_PATH", "SCHEME", "getContentUri", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "SHARED_DATA_KEY", HttpUrl.FRAGMENT_ENCODE_SET, "getAuthority", "gamePackage", "createUriMatcher", "Landroid/content/UriMatcher;", "getContentValuesForKeyValue", "Landroid/content/ContentValues;", "key", FirebaseAnalytics.Param.VALUE, "AUTHORITY_SUFFIX", "SHARED_ACCOUNTS_COLUMN_KEY", "SHARED_ACCOUNTS_COLUMN_VALUE", "COLUMN_SUCCESS", "QUERY_PARAM_ENV", "scid_plugin_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public final UriMatcher createUriMatcher(Context context) {
/* 4 */                 UriMatcher uriMatcher = new UriMatcher(-1);
/* 17 */                uriMatcher.addURI(getAuthority$default(SharedDataContentProvider.INSTANCE, context, null, 2, null), "data/*", 2);
/* 20 */                return uriMatcher;
                    }

                    public static /* synthetic */ String getAuthority$default(Companion companion, Context context, String str, int i, Object obj) {
/* 3 */                 if ((i & 2) != 0) {
/* 5 */                     str = null;
                        }
/* 6 */                 return companion.getAuthority(context, str);
                    }

                    public final String getAuthority(Context context, String gamePackage) {
/* 1 */                 context.getClass();
/* 4 */                 if (gamePackage == null) {
/* 6 */                     gamePackage = context.getPackageName();
                        }
/* 12 */                return fm0.m3783i(gamePackage, SharedDataContentProvider.AUTHORITY_SUFFIX);
                    }

                    public final Uri getContentUri(Context context) {
/* 1 */                 context.getClass();
/* 29 */                Uri uri = Uri.parse("content://" + getAuthority$default(this, context, null, 2, null) + "/data");
/* 33 */                uri.getClass();
/* 36 */                return uri;
                    }

                    public final ContentValues getContentValuesForKeyValue(String key, String value) {
/* 1 */                 key.getClass();
/* 6 */                 ContentValues contentValues = new ContentValues();
/* 11 */                contentValues.put(SharedDataContentProvider.SHARED_ACCOUNTS_COLUMN_KEY, key);
/* 16 */                contentValues.put(SharedDataContentProvider.SHARED_ACCOUNTS_COLUMN_VALUE, value);
/* 19 */                return contentValues;
                    }

/* 4 */             private Companion() {
                    }
                }
            }
