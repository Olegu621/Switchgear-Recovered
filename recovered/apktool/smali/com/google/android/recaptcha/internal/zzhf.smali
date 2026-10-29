.class public final Lcom/google/android/recaptcha/internal/zzhf;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field private final zza:Lkotlin/jvm/functions/Function2;

.field private final zzb:Ljava/lang/Integer;

.field private final zzc:I


# direct methods
.method public constructor <init>(ILkotlin/jvm/functions/Function2;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/google/android/recaptcha/internal/zzhf;->zzc:I

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzhf;->zza:Lkotlin/jvm/functions/Function2;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/recaptcha/internal/zzhf;->zzb:Ljava/lang/Integer;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/recaptcha/internal/zzhk;Lc10;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lcom/google/android/recaptcha/internal/zzhe;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/google/android/recaptcha/internal/zzhe;

    .line 7
    .line 8
    iget v1, v0, Lcom/google/android/recaptcha/internal/zzhe;->zzc:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/google/android/recaptcha/internal/zzhe;->zzc:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/google/android/recaptcha/internal/zzhe;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/google/android/recaptcha/internal/zzhe;-><init>(Lcom/google/android/recaptcha/internal/zzhf;Lc10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/google/android/recaptcha/internal/zzhe;->zza:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Lcom/google/android/recaptcha/internal/zzhe;->zzc:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, Lcom/google/android/recaptcha/internal/zzhe;->zzd:Lcom/google/android/recaptcha/internal/zzgr;

    .line 37
    .line 38
    :try_start_0
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/google/android/recaptcha/internal/zzcg; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :catch_0
    move-exception p1

    .line 43
    goto :goto_2

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return-object p0

    .line 51
    :cond_2
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget p2, p0, Lcom/google/android/recaptcha/internal/zzhf;->zzc:I

    .line 55
    .line 56
    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzhf;->zzb:Ljava/lang/Integer;

    .line 57
    .line 58
    new-instance v4, Lcom/google/android/recaptcha/internal/zzgr;

    .line 59
    .line 60
    invoke-direct {v4, p1, p2, v2}, Lcom/google/android/recaptcha/internal/zzgr;-><init>(Lcom/google/android/recaptcha/internal/zzhk;ILjava/lang/Integer;)V

    .line 61
    .line 62
    .line 63
    :try_start_1
    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzhf;->zza:Lkotlin/jvm/functions/Function2;

    .line 64
    .line 65
    iput-object v4, v0, Lcom/google/android/recaptcha/internal/zzhe;->zzd:Lcom/google/android/recaptcha/internal/zzgr;

    .line 66
    .line 67
    iput v3, v0, Lcom/google/android/recaptcha/internal/zzhe;->zzc:I

    .line 68
    .line 69
    invoke-interface {p0, v4, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p2
    :try_end_1
    .catch Lcom/google/android/recaptcha/internal/zzcg; {:try_start_1 .. :try_end_1} :catch_1

    .line 73
    if-eq p2, v1, :cond_3

    .line 74
    .line 75
    move-object p0, v4

    .line 76
    :goto_1
    :try_start_2
    invoke-virtual {p0}, Lcom/google/android/recaptcha/internal/zzgr;->zzb()V
    :try_end_2
    .catch Lcom/google/android/recaptcha/internal/zzcg; {:try_start_2 .. :try_end_2} :catch_0

    .line 77
    .line 78
    .line 79
    return-object p2

    .line 80
    :cond_3
    return-object v1

    .line 81
    :catch_1
    move-exception p0

    .line 82
    move-object p1, p0

    .line 83
    move-object p0, v4

    .line 84
    :goto_2
    invoke-virtual {p0, p1}, Lcom/google/android/recaptcha/internal/zzgr;->zzc(Lcom/google/android/recaptcha/internal/zzcg;)V

    .line 85
    .line 86
    .line 87
    throw p1
.end method
