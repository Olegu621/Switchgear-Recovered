            package com.google.firebase.installations.local;

            import io.sentry.config.AbstractC1417a;
            import java.io.ByteArrayOutputStream;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import okhttp3.internal.http2.Http2;
            import org.json.JSONException;
            import org.json.JSONObject;
            import p000.vi0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class PersistedInstallation {
                private static final String AUTH_TOKEN_KEY = "AuthToken";
                private static final String EXPIRES_IN_SECONDS_KEY = "ExpiresInSecs";
                private static final String FIREBASE_INSTALLATION_ID_KEY = "Fid";
                private static final String FIS_ERROR_KEY = "FisError";
                private static final String PERSISTED_STATUS_KEY = "Status";
                private static final String REFRESH_TOKEN_KEY = "RefreshToken";
                private static final String SETTINGS_FILE_NAME_PREFIX = "PersistedInstallation";
                private static final String TOKEN_CREATION_TIME_IN_SECONDS_KEY = "TokenCreationEpochInSecs";
                private File dataFile;
                private final vi0 firebaseApp;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum RegistrationStatus {
                    ATTEMPT_MIGRATION,
                    NOT_GENERATED,
                    UNREGISTERED,
                    REGISTERED,
                    REGISTER_ERROR
                }

                public PersistedInstallation(vi0 vi0Var) {
/* 4 */             this.firebaseApp = vi0Var;
                }

                private File getDataFile() {
/* 5 */             if (this.dataFile == null) {
                        synchronized (this) {
                            try {
/* 10 */                        if (this.dataFile == null) {
/* 14 */                            vi0 vi0Var = this.firebaseApp;
/* 16 */                            vi0Var.m9274a();
/* 51 */                            this.dataFile = new File(vi0Var.f18192a.getFilesDir(), "PersistedInstallation." + this.firebaseApp.m9276d() + ".json");
                                }
                            } catch (Throwable th) {
/* 59 */                        throw th;
                            }
                        }
                    }
/* 60 */            return this.dataFile;
                }

                private JSONObject readJSONFromFile() {
/* 3 */             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 8 */             byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
                    try {
/* 12 */                File dataFile = getDataFile();
/* 19 */                FileInputStream fileInputStreamM5164b = AbstractC1417a.m5164b(dataFile, new FileInputStream(dataFile));
                        while (true) {
                            try {
/* 24 */                        int i = fileInputStreamM5164b.read(bArr, 0, Http2.INITIAL_MAX_FRAME_SIZE);
/* 28 */                        if (i < 0) {
/* 36 */                            JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
/* 39 */                            fileInputStreamM5164b.close();
/* 42 */                            return jSONObject;
                                }
/* 45 */                        byteArrayOutputStream.write(bArr, 0, i);
                            } catch (Throwable th) {
                                try {
/* 49 */                            fileInputStreamM5164b.close();
                                } catch (Throwable th2) {
/* 54 */                            th.addSuppressed(th2);
                                }
/* 57 */                        throw th;
                            }
                        }
                    } catch (IOException | JSONException unused) {
/* 60 */                return new JSONObject();
                    }
                }

                public void clearForTesting() {
/* 5 */             getDataFile().delete();
                }

                public PersistedInstallationEntry insertOrUpdatePersistedInstallationEntry(PersistedInstallationEntry persistedInstallationEntry) {
                    try {
/* 3 */                 JSONObject jSONObject = new JSONObject();
/* 12 */                jSONObject.put(FIREBASE_INSTALLATION_ID_KEY, persistedInstallationEntry.getFirebaseInstallationId());
/* 25 */                jSONObject.put(PERSISTED_STATUS_KEY, persistedInstallationEntry.getRegistrationStatus().ordinal());
/* 34 */                jSONObject.put(AUTH_TOKEN_KEY, persistedInstallationEntry.getAuthToken());
/* 43 */                jSONObject.put(REFRESH_TOKEN_KEY, persistedInstallationEntry.getRefreshToken());
/* 52 */                jSONObject.put(TOKEN_CREATION_TIME_IN_SECONDS_KEY, persistedInstallationEntry.getTokenCreationEpochInSecs());
/* 61 */                jSONObject.put(EXPIRES_IN_SECONDS_KEY, persistedInstallationEntry.getExpiresInSecs());
/* 70 */                jSONObject.put(FIS_ERROR_KEY, persistedInstallationEntry.getFisError());
/* 77 */                vi0 vi0Var = this.firebaseApp;
/* 79 */                vi0Var.m9274a();
/* 88 */                File fileCreateTempFile = File.createTempFile(SETTINGS_FILE_NAME_PREFIX, "tmp", vi0Var.f18192a.getFilesDir());
/* 97 */                FileOutputStream fileOutputStreamM5167e = AbstractC1417a.m5167e(new FileOutputStream(fileCreateTempFile), fileCreateTempFile);
/* 111 */               fileOutputStreamM5167e.write(jSONObject.toString().getBytes("UTF-8"));
/* 114 */               fileOutputStreamM5167e.close();
/* 125 */               if (!fileCreateTempFile.renameTo(getDataFile())) {
/* 135 */                   throw new IOException("unable to rename the tmpfile to PersistedInstallation");
                        }
                    } catch (IOException | JSONException unused) {
                    }
/* 136 */           return persistedInstallationEntry;
                }

                public PersistedInstallationEntry readPersistedInstallationEntryValue() {
/* 1 */             JSONObject jSONFromFile = readJSONFromFile();
/* 8 */             String strOptString = jSONFromFile.optString(FIREBASE_INSTALLATION_ID_KEY, null);
/* 20 */            int iOptInt = jSONFromFile.optInt(PERSISTED_STATUS_KEY, RegistrationStatus.ATTEMPT_MIGRATION.ordinal());
/* 26 */            String strOptString2 = jSONFromFile.optString(AUTH_TOKEN_KEY, null);
/* 32 */            String strOptString3 = jSONFromFile.optString(REFRESH_TOKEN_KEY, null);
/* 40 */            long jOptLong = jSONFromFile.optLong(TOKEN_CREATION_TIME_IN_SECONDS_KEY, 0L);
/* 46 */            long jOptLong2 = jSONFromFile.optLong(EXPIRES_IN_SECONDS_KEY, 0L);
/* 94 */            return PersistedInstallationEntry.builder().setFirebaseInstallationId(strOptString).setRegistrationStatus(RegistrationStatus.values()[iOptInt]).setAuthToken(strOptString2).setRefreshToken(strOptString3).setTokenCreationEpochInSecs(jOptLong).setExpiresInSecs(jOptLong2).setFisError(jSONFromFile.optString(FIS_ERROR_KEY, null)).build();
                }
            }
