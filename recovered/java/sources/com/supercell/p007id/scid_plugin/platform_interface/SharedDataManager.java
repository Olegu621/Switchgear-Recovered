            package com.supercell.p007id.scid_plugin.platform_interface;

            import android.content.Context;
            import android.database.Cursor;
            import android.net.Uri;
            import com.supercell.p007id.scid_plugin.IdAccount;
            import com.supercell.p007id.scid_plugin.PromiseUtilKt;
            import com.supercell.p007id.scid_plugin.SharedDataStorage;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.ArrayList;
            import java.util.LinkedHashSet;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            import org.json.JSONArray;
            import p000.AbstractC0886en;
            import p000.C2103qd;
            import p000.e70;
            import p000.jb1;
            import p000.jd2;
            import p000.nd0;
            import p000.pn1;
            import p000.qs1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 $2\u00020\u0001:\u0002\u000f$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ9\u0010\u001e\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u001cj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t`\u001d2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010!\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#¨\u0006%"}, m6176d2 = {"Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager;", HttpUrl.FRAGMENT_ENCODE_SET, "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", HttpUrl.FRAGMENT_ENCODE_SET, "gamePackage", "scidEnvironment", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/supercell/id/scid_plugin/IdAccount;", "collectAccountsFromGame", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "gamePackageName", "key", "Ljd2;", "queryGameProvider", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljd2;", HttpUrl.FRAGMENT_ENCODE_SET, "clearCorruptedData", "(Ljava/lang/String;)V", "packageName", HttpUrl.FRAGMENT_ENCODE_SET, "isGameInstalled", "(Ljava/lang/String;)Z", "Landroid/net/Uri;", "buildURI", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;", "Le70;", "Lcom/supercell/id/scid_plugin/Promise;", "getAccountsFromGame", "(Ljava/lang/String;Ljava/lang/String;)Le70;", "accountsJson", "insertAccountsToGame", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Context;", "Companion", "scid_plugin_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
            public final class SharedDataManager {
                private static final String TAG = "SharedDataManager";
                private final Context context;

                public SharedDataManager(Context context) {
/* 1 */             context.getClass();
/* 7 */             this.context = context;
                }

                private final Uri buildURI(Context context, String key, String scidEnvironment, String packageName) {
/* 38 */            Uri uriBuild = new Uri.Builder().scheme("content").authority(SharedDataContentProvider.INSTANCE.getAuthority(context, packageName)).appendPath(SharedDataContentProvider.BASE_PATH).appendPath(key).appendQueryParameter(SharedDataContentProvider.QUERY_PARAM_ENV, scidEnvironment).build();
/* 42 */            uriBuild.getClass();
/* 45 */            return uriBuild;
                }

                public static /* synthetic */ Uri buildURI$default(SharedDataManager sharedDataManager, Context context, String str, String str2, String str3, int i, Object obj) {
/* 3 */             if ((i & 8) != 0) {
/* 5 */                 str3 = null;
                    }
/* 6 */             return sharedDataManager.buildURI(context, str, str2, str3);
                }

                private final void clearCorruptedData(String scidEnvironment) {
                    try {
/* 26 */                this.context.getContentResolver().delete(buildURI$default(this, this.context, SharedDataStorage.INSTANCE.getKeySharedAccounts(scidEnvironment), scidEnvironment, null, 8, null), null, null);
                    } catch (Exception e) {
/* 48 */                AbstractC1245n0.m4876d(TAG, "Failed to clear corrupted data " + e);
                    }
                }

                private final List<IdAccount> collectAccountsFromGame(String gamePackage, String scidEnvironment) {
/* 11 */            ArrayList arrayList = new ArrayList();
/* 20 */            boolean zM6216a = Intrinsics.m6216a(gamePackage, this.context.getPackageName());
                    try {
/* 30 */                jd2 jd2VarQueryGameProvider = queryGameProvider(gamePackage, SharedDataStorage.INSTANCE.getKeySharedAccounts(scidEnvironment), scidEnvironment);
/* 38 */                if (jd2VarQueryGameProvider instanceof SharedDataManager$QueryResult$Success) {
                            try {
/* 57 */                        arrayList.addAll(IdAccount.INSTANCE.parse(new JSONArray(((SharedDataManager$QueryResult$Success) jd2VarQueryGameProvider).getData())));
                            } catch (Exception e) {
/* 85 */                        AbstractC1245n0.m4877e(TAG, "JSON parsing error from " + gamePackage + ": " + e.getMessage(), e);
/* 88 */                        if (zM6216a) {
/* 92 */                            AbstractC1245n0.m4889q(TAG, "Clearing corrupted data from own package");
/* 95 */                            clearCorruptedData(scidEnvironment);
                                }
                            }
                        } else if (jd2VarQueryGameProvider instanceof SharedDataManager$QueryResult$UnexpectedStructure) {
/* 129 */                   AbstractC1245n0.m4889q(TAG, "Unexpected cursor structure from " + gamePackage + ": " + ((SharedDataManager$QueryResult$UnexpectedStructure) jd2VarQueryGameProvider).getColumns());
/* 132 */                   if (zM6216a) {
/* 136 */                       AbstractC1245n0.m4876d(TAG, "CRITICAL: Own ContentProvider returned unexpected structure - this is a bug!");
                            }
                        } else if (jd2VarQueryGameProvider instanceof SharedDataManager$QueryResult$SecurityError) {
/* 146 */                   ((SharedDataManager$QueryResult$SecurityError) jd2VarQueryGameProvider).getMessage();
                        } else if (jd2VarQueryGameProvider instanceof SharedDataManager$QueryResult$QueryException) {
/* 189 */                   AbstractC1245n0.m4877e(TAG, "Exception querying " + gamePackage + ": " + ((SharedDataManager$QueryResult$QueryException) jd2VarQueryGameProvider).getException().getMessage(), ((SharedDataManager$QueryResult$QueryException) jd2VarQueryGameProvider).getException());
                        } else if (!(jd2VarQueryGameProvider instanceof SharedDataManager$QueryResult$Empty)) {
/* 206 */                   throw new pn1();
                        }
/* 197 */               arrayList.size();
                    } catch (Exception e2) {
/* 221 */               AbstractC1245n0.m4877e(TAG, "Error collecting data from " + gamePackage, e2);
                    }
/* 229 */           return CollectionsKt.m6192K(new LinkedHashSet(arrayList));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final List getAccountsFromGame$lambda$0(SharedDataManager sharedDataManager, String str, String str2) {
                    return sharedDataManager.isGameInstalled(str) ? sharedDataManager.collectAccountsFromGame(str, str2) : nd0.f14189a;
                }

                private final boolean isGameInstalled(String packageName) {
                    try {
/* 8 */                 this.context.getPackageManager().getPackageInfo(packageName, 0);
/* 11 */                return true;
                    } catch (Exception unused) {
/* 1 */                 return false;
                    }
                }

                private final jd2 queryGameProvider(String gamePackageName, String key, String scidEnvironment) {
                    try {
/* 21 */                Cursor cursorQuery = this.context.getContentResolver().query(buildURI(this.context, key, scidEnvironment, gamePackageName), null, null, null, null);
/* 25 */                if (cursorQuery == null) {
/* 173 */                   return SharedDataManager$QueryResult$Empty.INSTANCE;
                        }
                        try {
/* 27 */                    cursorQuery.getCount();
/* 30 */                    String[] columnNames = cursorQuery.getColumnNames();
/* 34 */                    columnNames.getClass();
/* 40 */                    C2103qd.m7775j(null, 63, columnNames);
/* 47 */                    if (!cursorQuery.moveToFirst()) {
/* 49 */                        SharedDataManager$QueryResult$Empty sharedDataManager$QueryResult$Empty = SharedDataManager$QueryResult$Empty.INSTANCE;
/* 51 */                        cursorQuery.close();
/* 54 */                        return sharedDataManager$QueryResult$Empty;
                            }
/* 64 */                    int columnIndex = cursorQuery.getColumnIndex("success");
/* 70 */                    int columnIndex2 = cursorQuery.getColumnIndex(SharedDataContentProvider.SHARED_ACCOUNTS_COLUMN_VALUE);
/* 74 */                    if (columnIndex >= 0 && columnIndex2 >= 0 && cursorQuery.getInt(columnIndex) == 1) {
/* 85 */                        String string = cursorQuery.getString(columnIndex2);
/* 89 */                        if (string != null && string.length() != 0) {
/* 100 */                           SharedDataManager$QueryResult$Success sharedDataManager$QueryResult$Success = new SharedDataManager$QueryResult$Success(string);
/* 103 */                           cursorQuery.close();
/* 106 */                           return sharedDataManager$QueryResult$Success;
                                }
/* 107 */                       SharedDataManager$QueryResult$Empty sharedDataManager$QueryResult$Empty2 = SharedDataManager$QueryResult$Empty.INSTANCE;
/* 109 */                       cursorQuery.close();
/* 112 */                       return sharedDataManager$QueryResult$Empty2;
                            }
/* 113 */                   String[] columnNames2 = cursorQuery.getColumnNames();
/* 117 */                   columnNames2.getClass();
/* 144 */                   AbstractC1245n0.m4889q(TAG, "Unexpected cursor structure from " + gamePackageName + " - columns: " + C2103qd.m7775j(null, 63, columnNames2));
/* 149 */                   String[] columnNames3 = cursorQuery.getColumnNames();
/* 153 */                   columnNames3.getClass();
/* 160 */                   SharedDataManager$QueryResult$UnexpectedStructure sharedDataManager$QueryResult$UnexpectedStructure = new SharedDataManager$QueryResult$UnexpectedStructure(C2103qd.m7779n(columnNames3));
/* 163 */                   cursorQuery.close();
/* 166 */                   return sharedDataManager$QueryResult$UnexpectedStructure;
                        } catch (Throwable th) {
                            try {
/* 167 */                       throw th;
                            } catch (Throwable th2) {
/* 169 */                       jb1.m5754n(cursorQuery, th);
/* 172 */                       throw th2;
                            }
                        }
                    } catch (SecurityException e) {
/* 195 */               e.getMessage();
/* 200 */               String message = e.getMessage();
/* 204 */               if (message == null) {
/* 206 */                   message = "Security exception";
                        }
/* 208 */               return new SharedDataManager$QueryResult$SecurityError(message);
                    } catch (Exception e2) {
/* 184 */               AbstractC1245n0.m4877e(TAG, AbstractC0886en.m3509m("Failed to query ", gamePackageName, " for key ", key), e2);
/* 189 */               return new SharedDataManager$QueryResult$QueryException(e2);
                    }
                }

                public final e70 getAccountsFromGame(String gamePackage, String scidEnvironment) {
/* 1 */             gamePackage.getClass();
/* 4 */             scidEnvironment.getClass();
/* 12 */            return PromiseUtilKt.task(new qs1(this, gamePackage, scidEnvironment));
                }

                public final void insertAccountsToGame(String key, String scidEnvironment, String accountsJson) {
/* 1 */             key.getClass();
/* 4 */             scidEnvironment.getClass();
/* 32 */            this.context.getContentResolver().insert(buildURI$default(this, this.context, key, scidEnvironment, null, 8, null), SharedDataContentProvider.INSTANCE.getContentValuesForKeyValue(key, accountsJson));
                }
            }
