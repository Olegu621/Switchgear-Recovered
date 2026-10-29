            package com.google.android.gms.measurement;

            import android.content.ContentProvider;
            import android.content.ContentValues;
            import android.content.Context;
            import android.content.pm.ProviderInfo;
            import android.database.Cursor;
            import android.net.Uri;
            import io.sentry.android.core.performance.C1259g;
            import p000.f42;
            import p000.ij3;
            import p000.kb1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Deprecated
            public class AppMeasurementContentProvider extends ContentProvider {
                @Override // android.content.ContentProvider
                public final void attachInfo(Context context, ProviderInfo providerInfo) {
/* 1 */             super.attachInfo(context, providerInfo);
/* 12 */            if ("com.google.android.gms.measurement.google_measurement_service".equals(providerInfo.authority)) {
/* 17 */                f42.m3656l("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
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
/* 1 */             C1259g.m4908d(this);
/* 4 */             Context context = getContext();
/* 8 */             kb1.m6061n(context);
/* 12 */            ij3.m4556r(context, null, null);
/* 15 */            C1259g.m4909e(this);
/* 18 */            return false;
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
