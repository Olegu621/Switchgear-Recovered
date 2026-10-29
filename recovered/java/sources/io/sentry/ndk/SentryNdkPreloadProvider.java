            package io.sentry.ndk;

            import android.content.ContentProvider;
            import android.content.ContentValues;
            import android.content.Context;
            import android.database.Cursor;
            import android.net.Uri;
            import android.os.Bundle;
            import io.sentry.android.core.performance.C1259g;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class SentryNdkPreloadProvider extends ContentProvider {
                @Override // android.content.ContentProvider
                public final int delete(Uri uri, String str, String[] strArr) {
/* 1 */             return 0;
                }

                @Override // android.content.ContentProvider
                public final String getType(Uri uri) {
/* 1 */             return null;
                }

                @Override // android.content.ContentProvider
                public final Uri insert(Uri uri, ContentValues contentValues) {
/* 1 */             return null;
                }

                @Override // android.content.ContentProvider
                public final boolean onCreate() {
/* 1 */             C1259g.m4908d(this);
/* 4 */             Context context = getContext();
/* 9 */             if (context == null) {
/* 11 */                C1259g.m4909e(this);
/* 8 */                 return false;
                    }
                    try {
/* 29 */                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
/* 31 */                if (bundle != null && bundle.getBoolean("io.sentry.ndk.preload", false)) {
/* 41 */                    SentryNdk.preload();
                        }
                    } catch (Throwable unused) {
                    }
/* 44 */            C1259g.m4909e(this);
/* 47 */            return true;
                }

                @Override // android.content.ContentProvider
                public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
/* 1 */             return null;
                }

                @Override // android.content.ContentProvider
                public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
/* 1 */             return 0;
                }
            }
