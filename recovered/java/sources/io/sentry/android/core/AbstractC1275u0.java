            package io.sentry.android.core;

            import android.content.ContentProvider;
            import android.content.ContentValues;
            import android.database.Cursor;
            import android.net.Uri;
            import io.sentry.C1666s6;
            
            /* JADX INFO: renamed from: io.sentry.android.core.u0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC1275u0 extends ContentProvider {

                /* JADX INFO: renamed from: a */
                public final C1666s6 f10344a = new C1666s6(2);

                @Override // android.content.ContentProvider
                public final int delete(Uri uri, String str, String[] strArr) {
/* 3 */             this.f10344a.m5407k(this);
/* 6 */             return 0;
                }

                @Override // android.content.ContentProvider
                public final Uri insert(Uri uri, ContentValues contentValues) {
/* 3 */             this.f10344a.m5407k(this);
/* 6 */             return null;
                }

                @Override // android.content.ContentProvider
                public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
/* 3 */             this.f10344a.m5407k(this);
/* 6 */             return null;
                }

                @Override // android.content.ContentProvider
                public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
/* 3 */             this.f10344a.m5407k(this);
/* 6 */             return 0;
                }
            }
