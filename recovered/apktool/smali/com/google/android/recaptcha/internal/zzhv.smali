.class final Lcom/google/android/recaptcha/internal/zzhv;
.super Ltj2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field zza:I

.field final synthetic zzb:Lcom/google/android/recaptcha/internal/zzib;

.field final synthetic zzc:Lcom/google/android/recaptcha/internal/zzxn;

.field private synthetic zzd:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzib;Lcom/google/android/recaptcha/internal/zzxn;Lc10;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzhv;->zzb:Lcom/google/android/recaptcha/internal/zzib;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzhv;->zzc:Lcom/google/android/recaptcha/internal/zzxn;

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
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/recaptcha/internal/zzhv;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzhv;->zzb:Lcom/google/android/recaptcha/internal/zzib;

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzhv;->zzc:Lcom/google/android/recaptcha/internal/zzxn;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p2}, Lcom/google/android/recaptcha/internal/zzhv;-><init>(Lcom/google/android/recaptcha/internal/zzib;Lcom/google/android/recaptcha/internal/zzxn;Lc10;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lcom/google/android/recaptcha/internal/zzhv;->zzd:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/recaptcha/internal/zzhk;

    .line 2
    .line 3
    check-cast p2, Lc10;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/google/android/recaptcha/internal/zzhv;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcom/google/android/recaptcha/internal/zzhv;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/google/android/recaptcha/internal/zzhv;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/google/android/recaptcha/internal/zzhv;->zza:I

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
    :try_start_0
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzhv;->zzd:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lcom/google/android/recaptcha/internal/zzhk;

    .line 18
    .line 19
    :try_start_1
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzhv;->zzd:Ljava/lang/Object;

    .line 27
    .line 28
    move-object v1, p1

    .line 29
    check-cast v1, Lcom/google/android/recaptcha/internal/zzhk;

    .line 30
    .line 31
    :try_start_2
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzhv;->zzb:Lcom/google/android/recaptcha/internal/zzib;

    .line 32
    .line 33
    iget-object v4, p0, Lcom/google/android/recaptcha/internal/zzhv;->zzc:Lcom/google/android/recaptcha/internal/zzxn;

    .line 34
    .line 35
    invoke-virtual {v4}, Lcom/google/android/recaptcha/internal/zzxn;->zzM()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-virtual {v4}, Lcom/google/android/recaptcha/internal/zzxn;->zzN()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    iput-object v1, p0, Lcom/google/android/recaptcha/internal/zzhv;->zzd:Ljava/lang/Object;

    .line 44
    .line 45
    iput v3, p0, Lcom/google/android/recaptcha/internal/zzhv;->zza:I

    .line 46
    .line 47
    new-instance v3, Lcom/google/android/recaptcha/internal/zzhw;

    .line 48
    .line 49
    invoke-direct {v3, p1, v4, v5, v2}, Lcom/google/android/recaptcha/internal/zzhw;-><init>(Lcom/google/android/recaptcha/internal/zzib;Ljava/lang/String;Ljava/lang/String;Lc10;)V

    .line 50
    .line 51
    .line 52
    new-instance p1, Lcom/google/android/recaptcha/internal/zzhg;

    .line 53
    .line 54
    invoke-direct {p1, v3}, Lcom/google/android/recaptcha/internal/zzhg;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 55
    .line 56
    .line 57
    if-eq p1, v0, :cond_3

    .line 58
    .line 59
    :goto_0
    check-cast p1, Lcom/google/android/recaptcha/internal/zzhg;

    .line 60
    .line 61
    iput-object v2, p0, Lcom/google/android/recaptcha/internal/zzhv;->zzd:Ljava/lang/Object;

    .line 62
    .line 63
    const/4 v2, 0x2

    .line 64
    iput v2, p0, Lcom/google/android/recaptcha/internal/zzhv;->zza:I

    .line 65
    .line 66
    invoke-virtual {p1, v1, p0}, Lcom/google/android/recaptcha/internal/zzhg;->zza(Lcom/google/android/recaptcha/internal/zzhk;Lc10;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-ne p1, v0, :cond_2

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_2
    :goto_1
    check-cast p1, Ljava/lang/String;

    .line 74
    .line 75
    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzhv;->zzc:Lcom/google/android/recaptcha/internal/zzxn;

    .line 76
    .line 77
    invoke-virtual {p0}, Lcom/google/android/recaptcha/internal/zzxn;->zzl()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    const-string v0, "JAVASCRIPT_TAG"

    .line 82
    .line 83
    invoke-static {p0, v0, p1}, Lkotlin/text/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 87
    return-object p0

    .line 88
    :cond_3
    :goto_2
    return-object v0

    .line 89
    :catch_0
    move-exception v0

    .line 90
    move-object p0, v0

    .line 91
    instance-of p1, p0, Lcom/google/android/recaptcha/internal/zzcg;

    .line 92
    .line 93
    if-eqz p1, :cond_4

    .line 94
    .line 95
    throw p0

    .line 96
    :cond_4
    new-instance v0, Lcom/google/android/recaptcha/internal/zzcg;

    .line 97
    .line 98
    sget-object v1, Lcom/google/android/recaptcha/internal/zzce;->zzb:Lcom/google/android/recaptcha/internal/zzce;

    .line 99
    .line 100
    sget-object v2, Lcom/google/android/recaptcha/internal/zzcd;->zzL:Lcom/google/android/recaptcha/internal/zzcd;

    .line 101
    .line 102
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    const/16 v5, 0x8

    .line 107
    .line 108
    const/4 v6, 0x0

    .line 109
    const/4 v4, 0x0

    .line 110
    invoke-direct/range {v0 .. v6}, Lcom/google/android/recaptcha/internal/zzcg;-><init>(Lcom/google/android/recaptcha/internal/zzce;Lcom/google/android/recaptcha/internal/zzcd;Ljava/lang/String;Ljava/lang/Exception;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 111
    .line 112
    .line 113
    throw v0
.end method
