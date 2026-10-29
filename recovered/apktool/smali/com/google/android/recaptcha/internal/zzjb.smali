.class public final Lcom/google/android/recaptcha/internal/zzjb;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field private final zza:Lcom/google/android/recaptcha/internal/zzja;

.field private final zzb:Ljava/util/HashMap;

.field private final zzc:Lcom/google/android/recaptcha/internal/zzis;

.field private final zzd:Lcom/google/android/recaptcha/internal/zzdo;


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzis;Lcom/google/android/recaptcha/internal/zzdo;Lcom/google/android/recaptcha/internal/zzct;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzjb;->zzc:Lcom/google/android/recaptcha/internal/zzis;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzjb;->zzd:Lcom/google/android/recaptcha/internal/zzdo;

    .line 7
    .line 8
    new-instance p1, Lcom/google/android/recaptcha/internal/zzja;

    .line 9
    .line 10
    invoke-direct {p1}, Lcom/google/android/recaptcha/internal/zzja;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzjb;->zza:Lcom/google/android/recaptcha/internal/zzja;

    .line 14
    .line 15
    new-instance p2, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzjb;->zzb:Ljava/util/HashMap;

    .line 21
    .line 22
    const/16 p0, 0xad

    .line 23
    .line 24
    invoke-virtual {p1, p0, p2}, Lcom/google/android/recaptcha/internal/zzja;->zzd(ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/recaptcha/internal/zzja;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzjb;->zza:Lcom/google/android/recaptcha/internal/zzja;

    .line 2
    .line 3
    return-object p0
.end method

.method public final zzb()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzjb;->zza:Lcom/google/android/recaptcha/internal/zzja;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzja;->zzc()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0xad

    .line 7
    .line 8
    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzjb;->zzb:Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-virtual {v0, v1, p0}, Lcom/google/android/recaptcha/internal/zzja;->zzd(ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final zzc()Lcom/google/android/recaptcha/internal/zzdo;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzjb;->zzd:Lcom/google/android/recaptcha/internal/zzdo;

    .line 2
    .line 3
    return-object p0
.end method

.method public final zzd()Lcom/google/android/recaptcha/internal/zzis;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzjb;->zzc:Lcom/google/android/recaptcha/internal/zzis;

    .line 2
    .line 3
    return-object p0
.end method

.method public final zze(ILjava/lang/Object;)V
    .locals 0

    .line 1
    add-int/lit8 p1, p1, -0x2

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzjb;->zzb:Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    return-void
.end method
