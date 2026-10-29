.class public final Lxg3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final c:Lcom/google/android/gms/internal/playcore_age_signals/zzd;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/google/android/gms/internal/playcore_age_signals/zzo;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/playcore_age_signals/zzd;

    .line 2
    .line 3
    const-string v1, "AgeSignalsService"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/playcore_age_signals/zzd;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lxg3;->c:Lcom/google/android/gms/internal/playcore_age_signals/zzd;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxg3;->a:Landroid/content/Context;

    .line 5
    .line 6
    invoke-static {p1}, Lcom/google/android/gms/internal/playcore_age_signals/zzr;->zzb(Landroid/content/Context;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    new-instance v1, Lcom/google/android/gms/internal/playcore_age_signals/zzo;

    .line 13
    .line 14
    sget-object v5, Lwc3;->a:Landroid/content/Intent;

    .line 15
    .line 16
    new-instance v6, Lpf3;

    .line 17
    .line 18
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v4, "AgeSignalsService"

    .line 22
    .line 23
    const/4 v7, 0x0

    .line 24
    sget-object v3, Lxg3;->c:Lcom/google/android/gms/internal/playcore_age_signals/zzd;

    .line 25
    .line 26
    move-object v2, p1

    .line 27
    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/playcore_age_signals/zzo;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/playcore_age_signals/zzd;Ljava/lang/String;Landroid/content/Intent;Lpf3;Lcom/google/android/gms/internal/playcore_age_signals/zzj;)V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, Lxg3;->b:Lcom/google/android/gms/internal/playcore_age_signals/zzo;

    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    const/4 p1, 0x0

    .line 34
    iput-object p1, p0, Lxg3;->b:Lcom/google/android/gms/internal/playcore_age_signals/zzo;

    .line 35
    .line 36
    return-void
.end method
