            package androidx.startup;

            import android.content.ComponentName;
            import android.content.ContentProvider;
            import android.content.ContentValues;
            import android.content.Context;
            import android.content.pm.PackageManager;
            import android.database.Cursor;
            import android.net.Uri;
            import android.os.Trace;
            import io.sentry.android.core.performance.C1259g;
            import p000.C0875ec;
            import p000.C2086px;
            import p000.j13;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class InitializationProvider extends ContentProvider {
                @Override // android.content.ContentProvider
                public final int delete(Uri uri, String str, String[] strArr) {
/* 8 */             throw new IllegalStateException("Not allowed.");
                }

                @Override // android.content.ContentProvider
                public final String getType(Uri uri) {
/* 8 */             throw new IllegalStateException("Not allowed.");
                }

                @Override // android.content.ContentProvider
                public final Uri insert(Uri uri, ContentValues contentValues) {
/* 8 */             throw new IllegalStateException("Not allowed.");
                }

                @Override // android.content.ContentProvider
                public final boolean onCreate() {
/* 1 */             C1259g.m4908d(this);
/* 4 */             Context context = getContext();
/* 8 */             if (context == null) {
/* 82 */                C2086px c2086px = new C2086px("Context cannot be null");
/* 85 */                C1259g.m4909e(this);
/* 88 */                throw c2086px;
                    }
/* 14 */            if (context.getApplicationContext() != null) {
/* 16 */                C0875ec c0875ecM3362v = C0875ec.m3362v(context);
/* 20 */                Class<?> cls = getClass();
/* 26 */                Context context2 = (Context) c0875ecM3362v.f7615d;
                        try {
                            try {
/* 34 */                        Trace.beginSection(j13.m5636A("Startup"));
/* 54 */                        c0875ecM3362v.m3393q(context2.getPackageManager().getProviderInfo(new ComponentName(context2, cls), 128).metaData);
/* 57 */                        Trace.endSection();
                            } catch (PackageManager.NameNotFoundException e) {
/* 67 */                        throw new C2086px(e);
                            }
                        } catch (Throwable th) {
/* 69 */                    Trace.endSection();
/* 72 */                    throw th;
                        }
                    }
/* 73 */            C1259g.m4909e(this);
/* 76 */            return true;
                }

                @Override // android.content.ContentProvider
                public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
/* 8 */             throw new IllegalStateException("Not allowed.");
                }

                @Override // android.content.ContentProvider
                public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
/* 8 */             throw new IllegalStateException("Not allowed.");
                }
            }
