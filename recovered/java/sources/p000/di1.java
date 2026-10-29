            package p000;

            import com.google.android.gms.drive.DriveId;
            import com.google.android.gms.drive.metadata.CustomPropertyKey;
            import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
            import com.google.android.gms.internal.drive.zzhs;
            import com.google.android.gms.internal.drive.zzif;
            import com.google.android.gms.internal.drive.zzin;
            import java.util.Collections;
            import java.util.Date;
            import java.util.Map;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class di1 implements un0 {
                public static final int CONTENT_AVAILABLE_LOCALLY = 1;
                public static final int CONTENT_NOT_AVAILABLE_LOCALLY = 0;

                public String getAlternateLink() {
/* 7 */             return (String) zza(zzhs.zzjm);
                }

                public int getContentAvailability() {
/* 7 */             Integer num = (Integer) zza(zzin.zzlk);
/* 9 */             if (num == null) {
/* 11 */                return 0;
                    }
/* 13 */            return num.intValue();
                }

                public Date getCreatedDate() {
/* 7 */             return (Date) zza(zzif.zzld);
                }

                public Map<CustomPropertyKey, String> getCustomProperties() {
/* 7 */             AppVisibleCustomProperties appVisibleCustomProperties = (AppVisibleCustomProperties) zza(zzhs.zzjn);
                    return appVisibleCustomProperties == null ? Collections.EMPTY_MAP : appVisibleCustomProperties.m2032D1();
                }

                public String getDescription() {
/* 7 */             return (String) zza(zzhs.zzjo);
                }

                public DriveId getDriveId() {
/* 7 */             return (DriveId) zza(zzhs.zzjl);
                }

                public String getEmbedLink() {
/* 7 */             return (String) zza(zzhs.zzjp);
                }

                public String getFileExtension() {
/* 7 */             return (String) zza(zzhs.zzjq);
                }

                public long getFileSize() {
/* 9 */             return ((Long) zza(zzhs.zzjr)).longValue();
                }

                public Date getLastViewedByMeDate() {
/* 7 */             return (Date) zza(zzif.zzle);
                }

                public String getMimeType() {
/* 7 */             return (String) zza(zzhs.zzki);
                }

                public Date getModifiedByMeDate() {
/* 7 */             return (Date) zza(zzif.zzlg);
                }

                public Date getModifiedDate() {
/* 7 */             return (Date) zza(zzif.zzlf);
                }

                public String getOriginalFilename() {
/* 7 */             return (String) zza(zzhs.zzkj);
                }

                public long getQuotaBytesUsed() {
/* 9 */             return ((Long) zza(zzhs.zzko)).longValue();
                }

                public Date getSharedWithMeDate() {
/* 7 */             return (Date) zza(zzif.zzlh);
                }

                public String getTitle() {
/* 7 */             return (String) zza(zzhs.zzkr);
                }

                public String getWebContentLink() {
/* 7 */             return (String) zza(zzhs.zzkt);
                }

                public String getWebViewLink() {
/* 7 */             return (String) zza(zzhs.zzku);
                }

                public boolean isEditable() {
/* 7 */             Boolean bool = (Boolean) zza(zzhs.zzjx);
/* 9 */             if (bool == null) {
/* 11 */                return false;
                    }
/* 13 */            return bool.booleanValue();
                }

                public boolean isExplicitlyTrashed() {
/* 7 */             Boolean bool = (Boolean) zza(zzhs.zzjy);
/* 9 */             if (bool == null) {
/* 11 */                return false;
                    }
/* 13 */            return bool.booleanValue();
                }

                public boolean isFolder() {
/* 7 */             return "application/vnd.google-apps.folder".equals(getMimeType());
                }

                public boolean isInAppFolder() {
/* 7 */             Boolean bool = (Boolean) zza(zzhs.zzjv);
/* 9 */             if (bool == null) {
/* 11 */                return false;
                    }
/* 13 */            return bool.booleanValue();
                }

                public boolean isPinnable() {
/* 7 */             Boolean bool = (Boolean) zza(zzin.zzll);
/* 9 */             if (bool == null) {
/* 11 */                return false;
                    }
/* 13 */            return bool.booleanValue();
                }

                public boolean isPinned() {
/* 7 */             Boolean bool = (Boolean) zza(zzhs.zzka);
/* 9 */             if (bool == null) {
/* 11 */                return false;
                    }
/* 13 */            return bool.booleanValue();
                }

                public boolean isRestricted() {
/* 7 */             Boolean bool = (Boolean) zza(zzhs.zzkc);
/* 9 */             if (bool == null) {
/* 11 */                return false;
                    }
/* 13 */            return bool.booleanValue();
                }

                public boolean isShared() {
/* 7 */             Boolean bool = (Boolean) zza(zzhs.zzkd);
/* 9 */             if (bool == null) {
/* 11 */                return false;
                    }
/* 13 */            return bool.booleanValue();
                }

                public boolean isStarred() {
/* 7 */             Boolean bool = (Boolean) zza(zzhs.zzkp);
/* 9 */             if (bool == null) {
/* 11 */                return false;
                    }
/* 13 */            return bool.booleanValue();
                }

                public boolean isTrashable() {
/* 7 */             Boolean bool = (Boolean) zza(zzhs.zzkg);
                    return bool == null || bool.booleanValue();
                }

                public boolean isTrashed() {
/* 7 */             Boolean bool = (Boolean) zza(zzhs.zzks);
/* 9 */             if (bool == null) {
/* 11 */                return false;
                    }
/* 13 */            return bool.booleanValue();
                }

                public boolean isViewed() {
/* 7 */             Boolean bool = (Boolean) zza(zzhs.zzkh);
/* 9 */             if (bool == null) {
/* 11 */                return false;
                    }
/* 13 */            return bool.booleanValue();
                }

                public abstract Object zza(ii1 ii1Var);
            }
