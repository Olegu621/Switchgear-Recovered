.class final Lcom/google/android/recaptcha/internal/zzbd;
.super Ltj2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field zza:J

.field zzb:Z

.field zzc:I

.field final synthetic zzd:Lcom/google/android/recaptcha/internal/zzbo;

.field final synthetic zze:Lh22;


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzbo;Lh22;Lc10;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzbd;->zzd:Lcom/google/android/recaptcha/internal/zzbo;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzbd;->zze:Lh22;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Ltj2;-><init>(ILc10;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lc10;)Lc10;
    .locals 1

    .line 1
    new-instance p1, Lcom/google/android/recaptcha/internal/zzbd;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzbd;->zzd:Lcom/google/android/recaptcha/internal/zzbo;

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzbd;->zze:Lh22;

    .line 6
    .line 7
    invoke-direct {p1, v0, p0, p2}, Lcom/google/android/recaptcha/internal/zzbd;-><init>(Lcom/google/android/recaptcha/internal/zzbo;Lh22;Lc10;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ly10;

    .line 2
    .line 3
    check-cast p2, Lc10;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/google/android/recaptcha/internal/zzbd;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcom/google/android/recaptcha/internal/zzbd;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/google/android/recaptcha/internal/zzbd;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    sget-object v0, Lz10;->a:Lz10;

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/recaptcha/internal/zzbd;->zzc:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    if-eq v1, v3, :cond_0

    .line 10
    .line 11
    iget-boolean v1, p0, Lcom/google/android/recaptcha/internal/zzbd;->zzb:Z

    .line 12
    .line 13
    iget-wide v4, p0, Lcom/google/android/recaptcha/internal/zzbd;->zza:J

    .line 14
    .line 15
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    :goto_0
    move p1, v1

    .line 19
    goto/16 :goto_5

    .line 20
    .line 21
    :cond_0
    iget-wide v4, p0, Lcom/google/android/recaptcha/internal/zzbd;->zza:J

    .line 22
    .line 23
    :try_start_0
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    goto :goto_2

    .line 27
    :catch_0
    move-exception p1

    .line 28
    goto :goto_3

    .line 29
    :cond_1
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    const-wide/16 v4, 0x3e8

    .line 33
    .line 34
    move p1, v3

    .line 35
    :goto_1
    if-eqz p1, :cond_6

    .line 36
    .line 37
    :try_start_1
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzbd;->zzd:Lcom/google/android/recaptcha/internal/zzbo;

    .line 38
    .line 39
    iput-wide v4, p0, Lcom/google/android/recaptcha/internal/zzbd;->zza:J

    .line 40
    .line 41
    iput v3, p0, Lcom/google/android/recaptcha/internal/zzbd;->zzc:I

    .line 42
    .line 43
    invoke-static {p1, p0}, Lcom/google/android/recaptcha/internal/zzbo;->zzc(Lcom/google/android/recaptcha/internal/zzbo;Lc10;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-eq p1, v0, :cond_4

    .line 48
    .line 49
    :goto_2
    check-cast p1, Lcom/google/android/play/core/integrity/StandardIntegrityManager$StandardIntegrityTokenProvider;

    .line 50
    .line 51
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzbd;->zzd:Lcom/google/android/recaptcha/internal/zzbo;

    .line 52
    .line 53
    invoke-virtual {v1}, Lcom/google/android/recaptcha/internal/zzbo;->zzf()Ljx;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    check-cast v6, Lkx;

    .line 58
    .line 59
    invoke-virtual {v6, p1}, Lz01;->D(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    sget-object p1, Lcom/google/android/recaptcha/internal/zzbp;->zzc:Lcom/google/android/recaptcha/internal/zzbp;

    .line 63
    .line 64
    invoke-static {v1, p1}, Lcom/google/android/recaptcha/internal/zzbo;->zzi(Lcom/google/android/recaptcha/internal/zzbo;Lcom/google/android/recaptcha/internal/zzbp;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 65
    .line 66
    .line 67
    move p1, v2

    .line 68
    goto :goto_1

    .line 69
    :goto_3
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzbd;->zze:Lh22;

    .line 70
    .line 71
    iput-object p1, v1, Lh22;->a:Ljava/lang/Object;

    .line 72
    .line 73
    instance-of v1, p1, Lcom/google/android/play/core/integrity/StandardIntegrityException;

    .line 74
    .line 75
    if-eqz v1, :cond_2

    .line 76
    .line 77
    move-object v1, p1

    .line 78
    check-cast v1, Lcom/google/android/play/core/integrity/StandardIntegrityException;

    .line 79
    .line 80
    invoke-virtual {v1}, Lcom/google/android/play/core/integrity/StandardIntegrityException;->getErrorCode()I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    const/16 v6, -0x64

    .line 85
    .line 86
    if-eq v1, v6, :cond_3

    .line 87
    .line 88
    const/16 v6, -0x12

    .line 89
    .line 90
    if-eq v1, v6, :cond_3

    .line 91
    .line 92
    const/16 v6, -0xc

    .line 93
    .line 94
    if-eq v1, v6, :cond_3

    .line 95
    .line 96
    const/4 v6, -0x8

    .line 97
    if-eq v1, v6, :cond_3

    .line 98
    .line 99
    const/4 v6, -0x3

    .line 100
    if-eq v1, v6, :cond_3

    .line 101
    .line 102
    :cond_2
    move v1, v2

    .line 103
    goto :goto_4

    .line 104
    :cond_3
    move v1, v3

    .line 105
    :goto_4
    if-eqz v1, :cond_5

    .line 106
    .line 107
    iput-wide v4, p0, Lcom/google/android/recaptcha/internal/zzbd;->zza:J

    .line 108
    .line 109
    iput-boolean v3, p0, Lcom/google/android/recaptcha/internal/zzbd;->zzb:Z

    .line 110
    .line 111
    const/4 p1, 0x2

    .line 112
    iput p1, p0, Lcom/google/android/recaptcha/internal/zzbd;->zzc:I

    .line 113
    .line 114
    invoke-static {v4, v5, p0}, Lw11;->h(JLd10;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    if-eq p1, v0, :cond_4

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :goto_5
    add-long/2addr v4, v4

    .line 122
    goto :goto_1

    .line 123
    :cond_4
    return-object v0

    .line 124
    :cond_5
    throw p1

    .line 125
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 126
    .line 127
    return-object p0
.end method
