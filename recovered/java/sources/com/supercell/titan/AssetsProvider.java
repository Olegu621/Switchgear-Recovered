            package com.supercell.titan;

            import android.content.ContentProvider;
            import android.content.ContentValues;
            import android.content.res.AssetFileDescriptor;
            import android.database.Cursor;
            import android.net.Uri;
            import android.os.CancellationSignal;
            import io.sentry.android.core.performance.C1259g;
            import java.io.FileNotFoundException;
            import java.io.IOException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 4 */     public class AssetsProvider extends ContentProvider {
                @Override // android.content.ContentProvider
                public int delete(Uri uri, String str, String[] strArr) {
/* 1 */             return 0;
                }

                @Override // android.content.ContentProvider
                public String getType(Uri uri) {
/* 1 */             return null;
                }

                @Override // android.content.ContentProvider
                public Uri insert(Uri uri, ContentValues contentValues) {
/* 1 */             return null;
                }

                @Override // android.content.ContentProvider
                public boolean onCreate() {
/* 1 */             C1259g.m4908d(this);
/* 4 */             C1259g.m4909e(this);
/* 7 */             return false;
                }

                @Override // android.content.ContentProvider
                public AssetFileDescriptor openAssetFile(Uri uri, String str) throws FileNotFoundException {
                    try {
/* 26 */                return getContext().getAssets().openFd(uri.getPath().substring(1, uri.getPath().length()));
                    } catch (IOException unused) {
/* 31 */                return null;
                    }
                }

                @Override // android.content.ContentProvider
                public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
/* 1 */             return super.query(uri, strArr, str, strArr2, str2, cancellationSignal);
                }

                @Override // android.content.ContentProvider
                public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
/* 1 */             return 0;
                }

                @Override // android.content.ContentProvider
/* 5 */         public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
/* 6 */             return null;
                }
            }
