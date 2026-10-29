            package com.google.firebase.provider;

            import android.content.ContentProvider;
            import android.content.ContentValues;
            import android.content.Context;
            import android.content.pm.ProviderInfo;
            import android.database.Cursor;
            import android.net.Uri;
            import android.os.SystemClock;
            import io.sentry.android.core.performance.C1259g;
            import java.util.concurrent.atomic.AtomicBoolean;
            import p000.C1963ng;
            import p000.f42;
            import p000.kb1;
            import p000.vi0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class FirebaseInitProvider extends ContentProvider {

                /* JADX INFO: renamed from: a */
                public static final C1963ng f5309a = new C1963ng(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());

                /* JADX INFO: renamed from: b */
                public static final AtomicBoolean f5310b = new AtomicBoolean(false);

                @Override // android.content.ContentProvider
                public final void attachInfo(Context context, ProviderInfo providerInfo) {
/* 3 */             kb1.m6062o(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
/* 14 */            if ("com.google.firebase.firebaseinitprovider".equals(providerInfo.authority)) {
/* 22 */                f42.m3656l("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
                    } else {
/* 16 */                super.attachInfo(context, providerInfo);
                    }
                }

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
/* 1 */             AtomicBoolean atomicBoolean = f5310b;
/* 3 */             C1259g.m4908d(this);
                    try {
/* 8 */                 atomicBoolean.set(true);
/* 15 */                vi0.m9273g(getContext());
/* 7 */                 return false;
                    } finally {
/* 26 */                atomicBoolean.set(false);
/* 29 */                C1259g.m4909e(this);
                    }
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
