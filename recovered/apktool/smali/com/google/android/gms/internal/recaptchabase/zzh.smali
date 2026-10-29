.class public final synthetic Lcom/google/android/gms/internal/recaptchabase/zzh;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lc32;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/recaptchabase/InitRequest;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/recaptchabase/InitRequest;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/recaptchabase/zzh;->zza:Lcom/google/android/gms/recaptchabase/InitRequest;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/recaptchabase/zzm;

    .line 2
    .line 3
    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 4
    .line 5
    sget v0, Lcom/google/android/gms/internal/recaptchabase/zzl;->zza:I

    .line 6
    .line 7
    iget-object p0, p0, Lcom/google/android/gms/internal/recaptchabase/zzh;->zza:Lcom/google/android/gms/recaptchabase/InitRequest;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v0, Lcom/google/android/gms/internal/recaptchabase/zzk;

    .line 13
    .line 14
    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/recaptchabase/zzk;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->getService()Landroid/os/IInterface;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lcom/google/android/gms/internal/recaptchabase/zzf;

    .line 22
    .line 23
    invoke-virtual {p1, v0, p0}, Lcom/google/android/gms/internal/recaptchabase/zzf;->zzd(Lcom/google/android/gms/internal/recaptchabase/zze;Lcom/google/android/gms/recaptchabase/InitRequest;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
