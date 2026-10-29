            package com.supercell.titan.agesignals;

            import android.content.Context;
            import android.os.Handler;
            import android.os.Looper;
            import com.appsflyer.internal.AbstractC0298j;
            import com.google.android.gms.internal.playcore_age_signals.zzo;
            import com.google.android.gms.internal.playcore_age_signals.zzr;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import com.google.android.gms.tasks.Tasks;
            import java.text.SimpleDateFormat;
            import java.util.Locale;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            import p000.C0009a7;
            import p000.C0899f;
            import p000.C2357x6;
            import p000.C2487y6;
            import p000.dc0;
            import p000.eb0;
            import p000.er0;
            import p000.fb0;
            import p000.ib0;
            import p000.mn0;
            import p000.vf3;
            import p000.xg3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m6176d2 = {"Lcom/supercell/titan/agesignals/AgeSignals;", HttpUrl.FRAGMENT_ENCODE_SET, "<init>", "()V", "Landroid/content/Context;", "context", HttpUrl.FRAGMENT_ENCODE_SET, "init", "(Landroid/content/Context;)V", HttpUrl.FRAGMENT_ENCODE_SET, "isInitDone", "()Z", "Lcom/supercell/titan/agesignals/AgeSignals$AgeRangeResult;", "getAgeRangeResult", "()Lcom/supercell/titan/agesignals/AgeSignals$AgeRangeResult;", "AgeRangeResult", "age-signals"}, m6177k = 1, m6178mv = {2, 2, 0}, m6180xi = 48)
/* 36 */    public final class AgeSignals {

                @Deprecated
                public static final int MAX_RETRIES = 5;

                /* JADX INFO: renamed from: c */
                public static final long f5980c;

                /* JADX INFO: renamed from: d */
                public static final long f5981d;

                /* JADX INFO: renamed from: e */
                public static final SimpleDateFormat f5982e;

                /* JADX INFO: renamed from: a */
                public volatile AgeRangeResult f5983a;

                /* JADX INFO: renamed from: b */
                public final Handler f5984b = new Handler(Looper.getMainLooper());

                static {
                    eb0 eb0Var = fb0.f8059b;
/* 3 */             ib0 ib0Var = ib0.SECONDS;
/* 10 */            f5980c = mn0.m6680D(1, ib0Var);
/* 18 */            f5981d = mn0.m6680D(30, ib0Var);
/* 29 */            f5982e = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
                }

                /* JADX INFO: renamed from: a */
                public final void m2752a(er0 er0Var, int i) {
                    Task taskForException;
/* 5 */             dc0 dc0Var = new dc0(16);
/* 10 */            xg3 xg3Var = (xg3) er0Var.f7853b;
/* 12 */            zzo zzoVar = xg3Var.f19090b;
/* 16 */            if (zzoVar == null) {
/* 82 */                xg3.f19088c.zza("onError(%d)", -2);
/* 90 */                taskForException = Tasks.forException(new C0009a7(-2));
                    } else if (zzr.zza(xg3Var.f19089a) < 82380000) {
/* 40 */                xg3.f19088c.zza("onError(%d)", -6);
/* 48 */                taskForException = Tasks.forException(new C0009a7(-6));
                    } else {
/* 55 */                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
/* 63 */                zzoVar.zzt(new vf3(xg3Var, taskCompletionSource, taskCompletionSource, dc0Var), taskCompletionSource);
/* 66 */                taskForException = taskCompletionSource.getTask();
                    }
/* 115 */           taskForException.addOnSuccessListener(new C2357x6(new C0899f(this, 1), 0)).addOnFailureListener(new C2487y6(this, i, er0Var));
                }

                /* JADX INFO: renamed from: getAgeRangeResult, reason: from getter */
                public final AgeRangeResult getF5983a() {
/* 1 */             return this.f5983a;
                }

                public final void init(Context context) {
/* 1 */             context.getClass();
/* 6 */             if (this.f5983a != null) {
/* 8 */                 return;
                    }
/* 26 */            m2752a(new er0(new xg3(context.getApplicationContext()), 29), 0);
                }

                public final boolean isInitDone() {
                    return this.f5983a != null;
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\"\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JL\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0003\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\u0010R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0015¨\u0006+"}, m6176d2 = {"Lcom/supercell/titan/agesignals/AgeSignals$AgeRangeResult;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "isApplicable", HttpUrl.FRAGMENT_ENCODE_SET, "error", "verificationStatus", "ageLowerBound", "ageUpperBound", HttpUrl.FRAGMENT_ENCODE_SET, "mostRecentApprovalDate", "<init>", "(ZIIIILjava/lang/String;)V", "component1", "()Z", "component2", "()I", "component3", "component4", "component5", "component6", "()Ljava/lang/String;", "copy", "(ZIIIILjava/lang/String;)Lcom/supercell/titan/agesignals/AgeSignals$AgeRangeResult;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "I", "getError", "c", "getVerificationStatus", "d", "getAgeLowerBound", "e", "getAgeUpperBound", "f", "Ljava/lang/String;", "getMostRecentApprovalDate", "age-signals"}, m6177k = 1, m6178mv = {2, 2, 0}, m6180xi = 48)
/* 37 */        public static final /* data */ class AgeRangeResult {

                    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
                    public final boolean isApplicable;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    public final int error;

                    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
                    public final int verificationStatus;

                    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
                    public final int ageLowerBound;

                    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
                    public final int ageUpperBound;

                    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
                    public final String mostRecentApprovalDate;

                    public /* synthetic */ AgeRangeResult(boolean z, int i, int i2, int i3, int i4, String str, int i5, DefaultConstructorMarker defaultConstructorMarker) {
/* 35 */                this((i5 & 1) != 0 ? true : z, i, (i5 & 4) != 0 ? 4 : i2, (i5 & 8) != 0 ? -1 : i3, (i5 & 16) != 0 ? -1 : i4, (i5 & 32) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str);
                    }

                    public static /* synthetic */ AgeRangeResult copy$default(AgeRangeResult ageRangeResult, boolean z, int i, int i2, int i3, int i4, String str, int i5, Object obj) {
/* 3 */                 if ((i5 & 1) != 0) {
/* 5 */                     z = ageRangeResult.isApplicable;
                        }
/* 9 */                 if ((i5 & 2) != 0) {
/* 11 */                    i = ageRangeResult.error;
                        }
/* 15 */                if ((i5 & 4) != 0) {
/* 17 */                    i2 = ageRangeResult.verificationStatus;
                        }
/* 21 */                if ((i5 & 8) != 0) {
/* 23 */                    i3 = ageRangeResult.ageLowerBound;
                        }
/* 27 */                if ((i5 & 16) != 0) {
/* 29 */                    i4 = ageRangeResult.ageUpperBound;
                        }
/* 33 */                if ((i5 & 32) != 0) {
/* 35 */                    str = ageRangeResult.mostRecentApprovalDate;
                        }
/* 37 */                int i6 = i4;
/* 38 */                String str2 = str;
/* 44 */                return ageRangeResult.copy(z, i, i2, i3, i6, str2);
                    }

                    /* JADX INFO: renamed from: component1, reason: from getter */
                    public final boolean getIsApplicable() {
/* 1 */                 return this.isApplicable;
                    }

                    /* JADX INFO: renamed from: component2, reason: from getter */
                    public final int getError() {
/* 1 */                 return this.error;
                    }

                    /* JADX INFO: renamed from: component3, reason: from getter */
                    public final int getVerificationStatus() {
/* 1 */                 return this.verificationStatus;
                    }

                    /* JADX INFO: renamed from: component4, reason: from getter */
                    public final int getAgeLowerBound() {
/* 1 */                 return this.ageLowerBound;
                    }

                    /* JADX INFO: renamed from: component5, reason: from getter */
                    public final int getAgeUpperBound() {
/* 1 */                 return this.ageUpperBound;
                    }

                    /* JADX INFO: renamed from: component6, reason: from getter */
                    public final String getMostRecentApprovalDate() {
/* 1 */                 return this.mostRecentApprovalDate;
                    }

                    public final AgeRangeResult copy(boolean isApplicable, int error, int verificationStatus, int ageLowerBound, int ageUpperBound, String mostRecentApprovalDate) {
/* 1 */                 mostRecentApprovalDate.getClass();
/* 6 */                 return new AgeRangeResult(isApplicable, error, verificationStatus, ageLowerBound, ageUpperBound, mostRecentApprovalDate);
                    }

                    public boolean equals(Object other) {
/* 2 */                 if (this == other) {
/* 1 */                     return true;
                        }
/* 8 */                 if (!(other instanceof AgeRangeResult)) {
/* 7 */                     return false;
                        }
/* 11 */                AgeRangeResult ageRangeResult = (AgeRangeResult) other;
                        return this.isApplicable == ageRangeResult.isApplicable && this.error == ageRangeResult.error && this.verificationStatus == ageRangeResult.verificationStatus && this.ageLowerBound == ageRangeResult.ageLowerBound && this.ageUpperBound == ageRangeResult.ageUpperBound && Intrinsics.m6216a(this.mostRecentApprovalDate, ageRangeResult.mostRecentApprovalDate);
                    }

                    public final int getAgeLowerBound() {
/* 1 */                 return this.ageLowerBound;
                    }

                    public final int getAgeUpperBound() {
/* 1 */                 return this.ageUpperBound;
                    }

                    public final int getError() {
/* 1 */                 return this.error;
                    }

                    public final String getMostRecentApprovalDate() {
/* 1 */                 return this.mostRecentApprovalDate;
                    }

                    public final int getVerificationStatus() {
/* 1 */                 return this.verificationStatus;
                    }

                    public int hashCode() {
/* 40 */                return this.mostRecentApprovalDate.hashCode() + AbstractC0298j.m1860a(this.ageUpperBound, AbstractC0298j.m1860a(this.ageLowerBound, AbstractC0298j.m1860a(this.verificationStatus, AbstractC0298j.m1860a(this.error, Boolean.hashCode(this.isApplicable) * 31, 31), 31), 31), 31);
                    }

                    public final boolean isApplicable() {
/* 1 */                 return this.isApplicable;
                    }

                    public String toString() {
/* 68 */                return "AgeRangeResult(isApplicable=" + this.isApplicable + ", error=" + this.error + ", verificationStatus=" + this.verificationStatus + ", ageLowerBound=" + this.ageLowerBound + ", ageUpperBound=" + this.ageUpperBound + ", mostRecentApprovalDate=" + this.mostRecentApprovalDate + ")";
                    }

/* 38 */            public AgeRangeResult(boolean z, int i, int i2, int i3, int i4, String str) {
                        str.getClass();
/* 40 */                this.isApplicable = z;
/* 41 */                this.error = i;
/* 42 */                this.verificationStatus = i2;
/* 43 */                this.ageLowerBound = i3;
/* 44 */                this.ageUpperBound = i4;
/* 45 */                this.mostRecentApprovalDate = str;
                    }
                }
            }
