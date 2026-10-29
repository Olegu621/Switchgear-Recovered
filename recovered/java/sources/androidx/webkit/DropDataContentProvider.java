            package androidx.webkit;

            import android.content.ContentProvider;
            import android.content.ContentValues;
            import android.database.Cursor;
            import android.net.Uri;
            import android.os.Bundle;
            import android.os.ParcelFileDescriptor;
            import io.sentry.android.core.performance.C1259g;
            import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;
            import p000.d73;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class DropDataContentProvider extends ContentProvider {

                /* JADX INFO: renamed from: a */
                public DropDataContentProviderBoundaryInterface f2030a;

                /* JADX INFO: renamed from: a */
                public final DropDataContentProviderBoundaryInterface m1144a() {
/* 3 */             if (this.f2030a == null) {
/* 7 */                 DropDataContentProviderBoundaryInterface dropDataProvider = d73.f7038a.getDropDataProvider();
/* 11 */                this.f2030a = dropDataProvider;
/* 13 */                dropDataProvider.onCreate();
                    }
/* 16 */            return this.f2030a;
                }

                @Override // android.content.ContentProvider
                public final Bundle call(String str, String str2, Bundle bundle) {
/* 5 */             return m1144a().call(str, str2, bundle);
                }

                @Override // android.content.ContentProvider
                public final int delete(Uri uri, String str, String[] strArr) {
/* 8 */             throw new UnsupportedOperationException("delete method is not supported.");
                }

                @Override // android.content.ContentProvider
                public final String getType(Uri uri) {
/* 5 */             return m1144a().getType(uri);
                }

                @Override // android.content.ContentProvider
                public final Uri insert(Uri uri, ContentValues contentValues) {
/* 8 */             throw new UnsupportedOperationException("Insert method is not supported.");
                }

                @Override // android.content.ContentProvider
                public final boolean onCreate() {
/* 1 */             C1259g.m4908d(this);
/* 4 */             C1259g.m4909e(this);
/* 7 */             return true;
                }

                @Override // android.content.ContentProvider
                public final ParcelFileDescriptor openFile(Uri uri, String str) {
/* 5 */             return m1144a().openFile(this, uri);
                }

                @Override // android.content.ContentProvider
                public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
/* 5 */             return m1144a().query(uri, strArr, str, strArr2, str2);
                }

                @Override // android.content.ContentProvider
                public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
/* 8 */             throw new UnsupportedOperationException("update method is not supported.");
                }
            }
