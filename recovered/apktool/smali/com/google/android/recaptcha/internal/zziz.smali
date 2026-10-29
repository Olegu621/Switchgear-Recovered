.class public final Lcom/google/android/recaptcha/internal/zziz;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public zza:Lcom/google/android/recaptcha/internal/zzcs;

.field private final zzb:Lcom/google/android/recaptcha/internal/zzjb;

.field private zzc:Ljava/lang/String;

.field private zzd:I

.field private final zze:Lcom/google/android/recaptcha/internal/zzja;

.field private final zzf:Lcom/google/android/recaptcha/internal/zzcs;

.field private final zzg:Lcom/google/android/recaptcha/internal/zzis;

.field private final zzh:Lcom/google/android/recaptcha/internal/zzdo;


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzjb;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zziz;->zzb:Lcom/google/android/recaptcha/internal/zzjb;

    .line 5
    .line 6
    const-string v0, "recaptcha.m.Main.rge"

    .line 7
    .line 8
    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zziz;->zzc:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzjb;->zza()Lcom/google/android/recaptcha/internal/zzja;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zziz;->zze:Lcom/google/android/recaptcha/internal/zzja;

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzjb;->zzd()Lcom/google/android/recaptcha/internal/zzis;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zziz;->zzg:Lcom/google/android/recaptcha/internal/zzis;

    .line 21
    .line 22
    new-instance v0, Lcom/google/android/recaptcha/internal/zzcs;

    .line 23
    .line 24
    invoke-direct {v0}, Lcom/google/android/recaptcha/internal/zzcs;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zziz;->zzf:Lcom/google/android/recaptcha/internal/zzcs;

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzjb;->zzc()Lcom/google/android/recaptcha/internal/zzdo;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zziz;->zzh:Lcom/google/android/recaptcha/internal/zzdo;

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final zza()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/recaptcha/internal/zziz;->zzd:I

    .line 2
    .line 3
    return p0
.end method

.method public final zzb()Lcom/google/android/recaptcha/internal/zzcs;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zziz;->zzf:Lcom/google/android/recaptcha/internal/zzcs;

    .line 2
    .line 3
    return-object p0
.end method

.method public final zzc()Lcom/google/android/recaptcha/internal/zzja;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zziz;->zze:Lcom/google/android/recaptcha/internal/zzja;

    .line 2
    .line 3
    return-object p0
.end method

.method public final zzd()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zziz;->zzc:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final zze()V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zziz;->zzb:Lcom/google/android/recaptcha/internal/zzjb;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/recaptcha/internal/zzjb;->zzb()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final zzf(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zziz;->zzc:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final zzg(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/recaptcha/internal/zziz;->zzd:I

    .line 2
    .line 3
    return-void
.end method

.method public final zzh()Lcom/google/android/recaptcha/internal/zzdo;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zziz;->zzh:Lcom/google/android/recaptcha/internal/zzdo;

    .line 2
    .line 3
    return-object p0
.end method

.method public final zzi()Lcom/google/android/recaptcha/internal/zzis;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zziz;->zzg:Lcom/google/android/recaptcha/internal/zzis;

    .line 2
    .line 3
    return-object p0
.end method
