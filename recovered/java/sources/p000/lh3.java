            package p000;

            import android.content.ContentValues;
            import android.database.Cursor;
            import android.database.sqlite.SQLiteDatabase;
            import android.database.sqlite.SQLiteDatabaseLockedException;
            import android.database.sqlite.SQLiteException;
            import android.database.sqlite.SQLiteFullException;
            import android.os.SystemClock;
            import com.google.android.gms.measurement.internal.zzr;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class lh3 extends wg3 {

                /* JADX INFO: renamed from: e */
                public static final String[] f13294e = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};

                /* JADX INFO: renamed from: c */
                public final zd3 f13295c;

                /* JADX INFO: renamed from: d */
                public boolean f13296d;

                public lh3(ij3 ij3Var) {
/* 1 */             super(ij3Var);
/* 15 */            this.f13295c = new zd3(this, ((ij3) this.f16749a).f9645a);
                }

                @Override // p000.wg3
                /* JADX INFO: renamed from: C */
                public final boolean mo4531C() {
/* 1 */             return false;
                }

                /* JADX INFO: renamed from: D */
                public final void m6449D() {
                    int iDelete;
/* 3 */             ij3 ij3Var = (ij3) this.f16749a;
/* 5 */             mo1375y();
                    try {
/* 8 */                 SQLiteDatabase sQLiteDatabaseM6451F = m6451F();
/* 12 */                if (sQLiteDatabaseM6451F == null || (iDelete = sQLiteDatabaseM6451F.delete("messages", null, null)) <= 0) {
/* 42 */                    return;
                        }
/* 23 */                uh3 uh3Var = ij3Var.f9655f;
/* 25 */                ij3.m4555l(uh3Var);
/* 36 */                uh3Var.f17534Y.m8511b(Integer.valueOf(iDelete), "Reset local analytics data. records");
                    } catch (SQLiteException e) {
/* 43 */                uh3 uh3Var2 = ij3Var.f9655f;
/* 45 */                ij3.m4555l(uh3Var2);
/* 52 */                uh3Var2.f17538f.m8511b(e, "Error resetting local analytics data. error");
                    }
                }

                /* JADX WARN: Code duplicated, block: B:29:0x0070 A[PHI: r5
  0x0070: PHI (r5v4 int) = (r5v1 int), (r5v2 int), (r5v1 int) binds: [B:32:0x0081, B:28:0x006e, B:25:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX INFO: renamed from: E */
                public final boolean m6450E() {
/* 5 */             ij3 ij3Var = (ij3) this.f16749a;
/* 7 */             mo1375y();
/* 13 */            if (!this.f13296d && ij3Var.f9645a.getDatabasePath("google_app_measurement_local.db").exists()) {
/* 32 */                int i = 5;
/* 34 */                for (int i2 = 0; i2 < 5; i2++) {
/* 36 */                    SQLiteDatabase sQLiteDatabase = null;
                            try {
                                try {
/* 38 */                            SQLiteDatabase sQLiteDatabaseM6451F = m6451F();
/* 42 */                            if (sQLiteDatabaseM6451F != null) {
/* 47 */                                sQLiteDatabaseM6451F.beginTransaction();
/* 63 */                                sQLiteDatabaseM6451F.delete("messages", "type == ?", new String[]{Integer.toString(3)});
/* 66 */                                sQLiteDatabaseM6451F.setTransactionSuccessful();
/* 69 */                                sQLiteDatabaseM6451F.endTransaction();
/* 72 */                                sQLiteDatabaseM6451F.close();
/* 37 */                                return true;
                                    }
/* 44 */                            this.f13296d = true;
                                } catch (SQLiteException e) {
/* 79 */                            if (0 != 0) {
                                        try {
/* 85 */                                    if (sQLiteDatabase.inTransaction()) {
/* 87 */                                        sQLiteDatabase.endTransaction();
                                            }
                                        } catch (Throwable th) {
/* 136 */                                   if (0 != 0) {
/* 138 */                                       sQLiteDatabase.close();
                                            }
/* 141 */                                   throw th;
                                        }
                                    }
/* 90 */                            uh3 uh3Var = ij3Var.f9655f;
/* 92 */                            ij3.m4555l(uh3Var);
/* 97 */                            uh3Var.f17538f.m8511b(e, "Error deleting app launch break from local database");
/* 100 */                           this.f13296d = true;
/* 102 */                           if (0 != 0) {
/* 113 */                               sQLiteDatabase.close();
                                    }
                                }
                            } catch (SQLiteDatabaseLockedException unused) {
/* 106 */                       SystemClock.sleep(i);
/* 109 */                       i += 20;
/* 111 */                       if (0 != 0) {
/* 113 */                           sQLiteDatabase.close();
                                }
                            } catch (SQLiteFullException e2) {
/* 118 */                       uh3 uh3Var2 = ij3Var.f9655f;
/* 120 */                       ij3.m4555l(uh3Var2);
/* 125 */                       uh3Var2.f17538f.m8511b(e2, "Error deleting app launch break from local database");
/* 128 */                       this.f13296d = true;
/* 130 */                       if (0 != 0) {
/* 113 */                           sQLiteDatabase.close();
                                }
                            }
                        }
/* 142 */               uh3 uh3Var3 = ij3Var.f9655f;
/* 144 */               ij3.m4555l(uh3Var3);
/* 151 */               uh3Var3.f17541w.m8510a("Error deleting app launch break from local database in reasonable time");
                    }
/* 12 */            return false;
                }

                /* JADX INFO: renamed from: F */
                public final SQLiteDatabase m6451F() {
/* 4 */             if (this.f13296d) {
/* 3 */                 return null;
                    }
/* 9 */             SQLiteDatabase writableDatabase = this.f13295c.getWritableDatabase();
/* 13 */            if (writableDatabase != null) {
/* 19 */                return writableDatabase;
                    }
/* 16 */            this.f13296d = true;
/* 3 */             return null;
                }

                /* JADX WARN: Code duplicated, block: B:121:0x0170 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:122:0x0170 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:124:0x0170 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:58:0x00f4  */
                /* JADX WARN: Code duplicated, block: B:73:0x0120 A[Catch: all -> 0x0154, TRY_ENTER, TryCatch #10 {all -> 0x0154, blocks: (B:30:0x0088, B:32:0x008e, B:43:0x00ae, B:45:0x00cf, B:47:0x00d8, B:49:0x00de, B:59:0x00f8, B:73:0x0120, B:75:0x0126, B:76:0x0129, B:93:0x015b, B:83:0x0144), top: B:109:0x0088 }] */
                /* JADX WARN: Code duplicated, block: B:78:0x0139  */
                /* JADX WARN: Code duplicated, block: B:86:0x014b  */
                /* JADX WARN: Code duplicated, block: B:88:0x0150 A[PHI: r8 r10 r17
  0x0150: PHI (r8v5 int) = (r8v3 int), (r8v3 int), (r8v6 int) binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]
  0x0150: PHI (r10v7 android.database.sqlite.SQLiteDatabase) = 
  (r10v5 android.database.sqlite.SQLiteDatabase)
  (r10v6 android.database.sqlite.SQLiteDatabase)
  (r10v8 android.database.sqlite.SQLiteDatabase)
 binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]
  0x0150: PHI (r17v7 boolean) = (r17v4 boolean), (r17v5 boolean), (r17v8 boolean) binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:95:0x016a  */
                /* JADX INFO: renamed from: G */
                public final boolean m6452G(byte[] bArr, int i) {
                    SQLiteDatabase sQLiteDatabaseM6451F;
                    boolean z;
                    boolean z2;
                    Cursor cursorRawQuery;
/* 5 */             ij3 ij3Var = (ij3) this.f16749a;
/* 7 */             mo1375y();
/* 12 */            boolean z3 = false;
/* 12 */            z3 = false;
/* 13 */            if (!this.f13296d) {
/* 16 */                pd3 pd3Var = ij3Var.f9651d;
/* 18 */                uh3 uh3Var = ij3Var.f9655f;
/* 20 */                ug3 ug3Var = vg3.f18123c1;
/* 22 */                Cursor cursor = null;
/* 22 */                cursor = null;
/* 38 */                zzr zzrVarM4532D = pd3Var.m7406J(null, ug3Var) ? ij3Var.m4569q().m4532D(null) : null;
/* 41 */                ContentValues contentValues = new ContentValues();
/* 50 */                contentValues.put("type", Integer.valueOf(i));
/* 57 */                contentValues.put("entry", bArr);
/* 66 */                if (ij3Var.f9651d.m7406J(null, ug3Var) && zzrVarM4532D != null) {
/* 74 */                    contentValues.put("app_version", zzrVarM4532D.f4244c);
/* 85 */                    contentValues.put("app_version_int", Long.valueOf(zzrVarM4532D.f4234U));
                        }
/* 89 */                int i2 = 5;
/* 90 */                int i3 = 0;
/* 91 */                for (int i4 = 5; i3 < i4; i4 = 5) {
                            try {
/* 94 */                        sQLiteDatabaseM6451F = m6451F();
/* 98 */                        if (sQLiteDatabaseM6451F == null) {
/* 100 */                           this.f13296d = true;
                                } else {
                                    try {
/* 124 */                               sQLiteDatabaseM6451F.beginTransaction();
/* 129 */                               cursorRawQuery = sQLiteDatabaseM6451F.rawQuery("select count(1) from messages", null);
/* 133 */                               long j = 0;
/* 135 */                               if (cursorRawQuery != null) {
                                            try {
                                                try {
/* 141 */                                           if (cursorRawQuery.moveToFirst()) {
/* 143 */                                               j = cursorRawQuery.getLong(z3 ? 1 : 0);
                                                    }
                                                } catch (Throwable th) {
/* 341 */                                           th = th;
/* 267 */                                           cursor = cursorRawQuery;
/* 376 */                                           if (cursor != null) {
/* 378 */                                               cursor.close();
                                                    }
/* 381 */                                           if (sQLiteDatabaseM6451F != null) {
/* 383 */                                               sQLiteDatabaseM6451F.close();
                                                    }
/* 386 */                                           throw th;
                                                }
                                            } catch (SQLiteDatabaseLockedException unused) {
/* 155 */                                       z = z3 ? 1 : 0;
/* 325 */                                       SystemClock.sleep(i2);
/* 328 */                                       i2 += 20;
/* 330 */                                       if (cursorRawQuery != null) {
/* 332 */                                           cursorRawQuery.close();
                                                }
/* 335 */                                       if (sQLiteDatabaseM6451F != null) {
/* 337 */                                           sQLiteDatabaseM6451F.close();
                                                }
/* 369 */                                       i3++;
/* 371 */                                       z3 = z;
                                            } catch (SQLiteFullException e) {
/* 159 */                                       e = e;
/* 160 */                                       z = z3 ? 1 : 0;
/* 348 */                                       ij3.m4555l(uh3Var);
/* 355 */                                       uh3Var.f17538f.m8511b(e, "Error writing entry; local database full");
/* 359 */                                       this.f13296d = true;
/* 361 */                                       if (cursorRawQuery != null) {
/* 363 */                                           cursorRawQuery.close();
                                                }
/* 366 */                                       if (sQLiteDatabaseM6451F != null) {
/* 337 */                                           sQLiteDatabaseM6451F.close();
                                                }
/* 369 */                                       i3++;
/* 371 */                                       z3 = z;
                                            } catch (SQLiteException e2) {
/* 148 */                                       e = e2;
/* 149 */                                       z = z3 ? 1 : 0;
/* 151 */                                       z2 = true;
/* 287 */                                       if (sQLiteDatabaseM6451F != null) {
/* 295 */                                           sQLiteDatabaseM6451F.endTransaction();
                                                }
/* 298 */                                       ij3.m4555l(uh3Var);
/* 305 */                                       uh3Var.f17538f.m8511b(e, "Error writing entry to local database");
/* 310 */                                       this.f13296d = z2;
/* 312 */                                       if (cursorRawQuery != null) {
/* 314 */                                           cursorRawQuery.close();
                                                }
/* 317 */                                       if (sQLiteDatabaseM6451F != null) {
/* 337 */                                           sQLiteDatabaseM6451F.close();
                                                }
/* 369 */                                       i3++;
/* 371 */                                       z3 = z;
                                            }
                                        }
/* 173 */                               if (j >= 100000) {
/* 175 */                                   ij3.m4555l(uh3Var);
/* 182 */                                   uh3Var.f17538f.m8510a("Data loss, local db full");
/* 190 */                                   long j2 = 100001 - j;
/* 199 */                                   long jDelete = sQLiteDatabaseM6451F.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j2)});
/* 206 */                                   if (jDelete != j2) {
/* 208 */                                       ij3.m4555l(uh3Var);
/* 211 */                                       sh3 sh3Var = uh3Var.f17538f;
/* 215 */                                       z = z3 ? 1 : 0;
                                                try {
                                                    try {
/* 221 */                                               z2 = true;
                                                        try {
/* 232 */                                                   sh3Var.m8513d("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(jDelete), Long.valueOf(j2 - jDelete));
                                                        } catch (SQLiteFullException e3) {
/* 238 */                                                   e = e3;
/* 348 */                                                   ij3.m4555l(uh3Var);
/* 355 */                                                   uh3Var.f17538f.m8511b(e, "Error writing entry; local database full");
/* 359 */                                                   this.f13296d = true;
/* 361 */                                                   if (cursorRawQuery != null) {
/* 363 */                                                       cursorRawQuery.close();
                                                            }
/* 366 */                                                   if (sQLiteDatabaseM6451F != null) {
/* 337 */                                                       sQLiteDatabaseM6451F.close();
                                                            }
/* 369 */                                                   i3++;
/* 371 */                                                   z3 = z;
                                                        } catch (SQLiteException e4) {
/* 236 */                                                   e = e4;
/* 287 */                                                   if (sQLiteDatabaseM6451F != null) {
/* 295 */                                                       sQLiteDatabaseM6451F.endTransaction();
                                                            }
/* 298 */                                                   ij3.m4555l(uh3Var);
/* 305 */                                                   uh3Var.f17538f.m8511b(e, "Error writing entry to local database");
/* 310 */                                                   this.f13296d = z2;
/* 312 */                                                   if (cursorRawQuery != null) {
/* 314 */                                                       cursorRawQuery.close();
                                                            }
/* 317 */                                                   if (sQLiteDatabaseM6451F != null) {
/* 337 */                                                       sQLiteDatabaseM6451F.close();
                                                            }
/* 369 */                                                   i3++;
/* 371 */                                                   z3 = z;
                                                        }
                                                    } catch (SQLiteDatabaseLockedException unused2) {
/* 325 */                                               SystemClock.sleep(i2);
/* 328 */                                               i2 += 20;
/* 330 */                                               if (cursorRawQuery != null) {
/* 332 */                                                   cursorRawQuery.close();
                                                        }
/* 335 */                                               if (sQLiteDatabaseM6451F != null) {
/* 337 */                                                   sQLiteDatabaseM6451F.close();
                                                        }
/* 369 */                                               i3++;
/* 371 */                                               z3 = z;
                                                    }
                                                } catch (SQLiteFullException e5) {
/* 243 */                                           e = e5;
/* 348 */                                           ij3.m4555l(uh3Var);
/* 355 */                                           uh3Var.f17538f.m8511b(e, "Error writing entry; local database full");
/* 359 */                                           this.f13296d = true;
/* 361 */                                           if (cursorRawQuery != null) {
/* 363 */                                               cursorRawQuery.close();
                                                    }
/* 366 */                                           if (sQLiteDatabaseM6451F != null) {
/* 337 */                                               sQLiteDatabaseM6451F.close();
                                                    }
/* 369 */                                           i3++;
/* 371 */                                           z3 = z;
                                                } catch (SQLiteException e6) {
/* 241 */                                           e = e6;
/* 151 */                                           z2 = true;
/* 287 */                                           if (sQLiteDatabaseM6451F != null && sQLiteDatabaseM6451F.inTransaction()) {
/* 295 */                                               sQLiteDatabaseM6451F.endTransaction();
                                                    }
/* 298 */                                           ij3.m4555l(uh3Var);
/* 305 */                                           uh3Var.f17538f.m8511b(e, "Error writing entry to local database");
/* 310 */                                           this.f13296d = z2;
/* 312 */                                           if (cursorRawQuery != null) {
/* 314 */                                               cursorRawQuery.close();
                                                    }
/* 317 */                                           if (sQLiteDatabaseM6451F != null) {
/* 337 */                                               sQLiteDatabaseM6451F.close();
                                                    }
/* 369 */                                           i3++;
/* 371 */                                           z3 = z;
                                                }
                                            } else {
/* 245 */                                       z = z3 ? 1 : 0;
/* 247 */                                       z2 = true;
                                            }
                                        } else {
/* 245 */                                   z = z3 ? 1 : 0;
/* 247 */                                   z2 = true;
                                        }
/* 249 */                               sQLiteDatabaseM6451F.insertOrThrow("messages", null, contentValues);
/* 252 */                               sQLiteDatabaseM6451F.setTransactionSuccessful();
/* 255 */                               sQLiteDatabaseM6451F.endTransaction();
/* 258 */                               if (cursorRawQuery != null) {
/* 260 */                                   cursorRawQuery.close();
                                        }
/* 263 */                               sQLiteDatabaseM6451F.close();
/* 266 */                               return z2;
                                    } catch (SQLiteDatabaseLockedException unused3) {
/* 113 */                               z = z3 ? 1 : 0;
/* 272 */                               cursorRawQuery = null;
                                    } catch (SQLiteFullException e7) {
/* 117 */                               e = e7;
/* 118 */                               z = z3 ? 1 : 0;
/* 274 */                               cursorRawQuery = null;
                                    } catch (SQLiteException e8) {
/* 106 */                               e = e8;
/* 107 */                               z = z3 ? 1 : 0;
/* 109 */                               z2 = true;
/* 270 */                               cursorRawQuery = null;
                                    } catch (Throwable th2) {
/* 103 */                               th = th2;
                                    }
                                }
                            } catch (SQLiteDatabaseLockedException unused4) {
/* 320 */                       z = z3 ? 1 : 0;
/* 322 */                       sQLiteDatabaseM6451F = null;
/* 323 */                       cursorRawQuery = null;
                            } catch (SQLiteFullException e9) {
/* 343 */                       e = e9;
/* 344 */                       z = z3 ? 1 : 0;
/* 346 */                       sQLiteDatabaseM6451F = null;
/* 347 */                       cursorRawQuery = null;
                            } catch (SQLiteException e10) {
/* 280 */                       e = e10;
/* 281 */                       z = z3 ? 1 : 0;
/* 283 */                       z2 = true;
/* 285 */                       sQLiteDatabaseM6451F = null;
/* 286 */                       cursorRawQuery = null;
                            } catch (Throwable th3) {
/* 276 */                       th = th3;
/* 277 */                       sQLiteDatabaseM6451F = null;
                            }
                        }
/* 387 */               boolean z4 = z3 ? 1 : 0;
/* 389 */               ij3.m4555l(uh3Var);
/* 396 */               uh3Var.f17534Y.m8510a("Failed to write entry to local database");
/* 399 */               return z4;
                    }
/* 102 */           return z3;
                }
            }
