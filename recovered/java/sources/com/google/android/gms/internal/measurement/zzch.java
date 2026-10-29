            package com.google.android.gms.internal.measurement;

            import android.app.job.JobInfo;
            import android.app.job.JobScheduler;
            import android.content.Context;
            import android.os.UserHandle;
            import android.util.Log;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzch {
                private static final Method zza;
                private static final Method zzb;

                static {
                    Method declaredMethod;
/* 6 */             Method declaredMethod2 = null;
                    try {
/* 30 */                declaredMethod = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
                    } catch (NoSuchMethodException unused) {
/* 39 */                if (Log.isLoggable("JobSchedulerCompat", 6)) {
/* 43 */                    AbstractC1245n0.m4876d("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
                        }
/* 46 */                declaredMethod = null;
                    }
/* 47 */            zza = declaredMethod;
                    try {
/* 53 */                declaredMethod2 = UserHandle.class.getDeclaredMethod("myUserId", null);
                    } catch (NoSuchMethodException unused2) {
/* 62 */                if (Log.isLoggable("JobSchedulerCompat", 6)) {
/* 66 */                    AbstractC1245n0.m4876d("JobSchedulerCompat", "No myUserId method available");
                        }
                    }
/* 69 */            zzb = declaredMethod2;
                }

                /* JADX WARN: Code duplicated, block: B:17:0x0031  */
                public static int zza(Context context, JobInfo jobInfo, String str, String str2) {
                    int iIntValue;
/* 7 */             JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
/* 9 */             jobScheduler.getClass();
/* 14 */            if (zza == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
/* 109 */               return jobScheduler.schedule(jobInfo);
                    }
/* 25 */            Method method = zzb;
/* 28 */            if (method != null) {
                        try {
/* 37 */                    Integer num = (Integer) method.invoke(UserHandle.class, null);
/* 39 */                    if (num != null) {
/* 41 */                        iIntValue = num.intValue();
                            } else {
/* 50 */                        iIntValue = 0;
                            }
                        } catch (IllegalAccessException | InvocationTargetException e) {
/* 59 */                    if (Log.isLoggable("JobSchedulerCompat", 6)) {
/* 63 */                        AbstractC1245n0.m4877e("JobSchedulerCompat", "myUserId invocation illegal", e);
                            }
                        }
                    } else {
/* 50 */                iIntValue = 0;
                    }
/* 71 */            Method method2 = zza;
/* 73 */            if (method2 != null) {
                        try {
/* 87 */                    Integer num2 = (Integer) method2.invoke(jobScheduler, jobInfo, "com.google.android.gms", Integer.valueOf(iIntValue), "UploadAlarm");
/* 89 */                    if (num2 != null) {
/* 91 */                        return num2.intValue();
                            }
/* 27 */                    return 0;
                        } catch (IllegalAccessException | InvocationTargetException e2) {
/* 101 */                   AbstractC1245n0.m4877e("UploadAlarm", "error calling scheduleAsPackage", e2);
                        }
                    }
/* 104 */           return jobScheduler.schedule(jobInfo);
                }
            }
