            package com.pichillilorenzo.flutter_inappwebview_android.credential_database;

            import android.content.Context;
            import com.pichillilorenzo.flutter_inappwebview_android.types.URLCredential;
            import com.pichillilorenzo.flutter_inappwebview_android.types.URLProtectionSpace;
            import java.util.ArrayList;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 9 */     public class CredentialDatabase {
                public static final String DATABASE_NAME = "CredentialDatabase.db";
                public static final int DATABASE_VERSION = 2;
                static final String LOG_TAG = "CredentialDatabase";
                private static CredentialDatabase instance;
                public URLCredentialDao credentialDao;

                /* JADX INFO: renamed from: db */
                public CredentialDatabaseHelper f5322db;
                public URLProtectionSpaceDao protectionSpaceDao;

                private CredentialDatabase(CredentialDatabaseHelper credentialDatabaseHelper, URLProtectionSpaceDao uRLProtectionSpaceDao, URLCredentialDao uRLCredentialDao) {
/* 4 */             this.f5322db = credentialDatabaseHelper;
/* 6 */             this.protectionSpaceDao = uRLProtectionSpaceDao;
/* 8 */             this.credentialDao = uRLCredentialDao;
                }

                public static CredentialDatabase getInstance(Context context) {
/* 1 */             CredentialDatabase credentialDatabase = instance;
/* 3 */             if (credentialDatabase != null) {
/* 5 */                 return credentialDatabase;
                    }
/* 8 */             CredentialDatabaseHelper credentialDatabaseHelper = new CredentialDatabaseHelper(context);
/* 23 */            CredentialDatabase credentialDatabase2 = new CredentialDatabase(credentialDatabaseHelper, new URLProtectionSpaceDao(credentialDatabaseHelper), new URLCredentialDao(credentialDatabaseHelper));
/* 26 */            instance = credentialDatabase2;
/* 28 */            return credentialDatabase2;
                }

                public void clearAllAuthCredentials() {
/* 1 */             CredentialDatabaseHelper credentialDatabaseHelper = this.f5322db;
/* 7 */             credentialDatabaseHelper.clearAllTables(credentialDatabaseHelper.getWritableDatabase());
                }

                public List<URLCredential> getHttpAuthCredentials(String str, String str2, String str3, Integer num) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 8 */             URLProtectionSpace uRLProtectionSpaceFind = this.protectionSpaceDao.find(str, str2, str3, num);
                    return uRLProtectionSpaceFind != null ? this.credentialDao.getAllByProtectionSpaceId(uRLProtectionSpaceFind.getId()) : arrayList;
                }

                public void removeHttpAuthCredential(String str, String str2, String str3, Integer num, String str4, String str5) {
/* 3 */             URLProtectionSpace uRLProtectionSpaceFind = this.protectionSpaceDao.find(str, str2, str3, num);
/* 7 */             if (uRLProtectionSpaceFind != null) {
/* 21 */                this.credentialDao.delete(this.credentialDao.find(str4, str5, uRLProtectionSpaceFind.getId()));
                    }
                }

                public void removeHttpAuthCredentials(String str, String str2, String str3, Integer num) {
/* 3 */             URLProtectionSpace uRLProtectionSpaceFind = this.protectionSpaceDao.find(str, str2, str3, num);
/* 7 */             if (uRLProtectionSpaceFind != null) {
/* 11 */                this.protectionSpaceDao.delete(uRLProtectionSpaceFind);
                    }
                }

                public void setHttpAuthCredential(String str, String str2, String str3, Integer num, String str4, String str5) {
                    boolean z;
/* 3 */             URLProtectionSpace uRLProtectionSpaceFind = this.protectionSpaceDao.find(str, str2, str3, num);
/* 33 */            Long lValueOf = uRLProtectionSpaceFind == null ? Long.valueOf(this.protectionSpaceDao.insert(new URLProtectionSpace(null, str, str2, str3, num.intValue()))) : uRLProtectionSpaceFind.getId();
/* 39 */            URLCredential uRLCredentialFind = this.credentialDao.find(str4, str5, lValueOf);
/* 43 */            if (uRLCredentialFind == null) {
/* 88 */                URLCredential uRLCredential = new URLCredential(null, str4, str5, lValueOf);
/* 101 */               uRLCredential.setId(Long.valueOf(this.credentialDao.insert(uRLCredential)));
/* 104 */               return;
                    }
/* 53 */            boolean z2 = true;
/* 54 */            if (uRLCredentialFind.getUsername().equals(str4)) {
/* 61 */                z = false;
                    } else {
/* 56 */                uRLCredentialFind.setUsername(str4);
/* 59 */                z = true;
                    }
/* 70 */            if (uRLCredentialFind.getPassword().equals(str5)) {
/* 76 */                z2 = z;
                    } else {
/* 72 */                uRLCredentialFind.setPassword(str5);
                    }
/* 77 */            if (z2) {
/* 81 */                this.credentialDao.update(uRLCredentialFind);
                    }
                }

/* 10 */        private CredentialDatabase() {
                }
            }
