.class final Lcom/google/android/recaptcha/internal/zzd;
.super Ltj2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field zza:I

.field final synthetic zzb:Lcom/google/android/recaptcha/internal/zzg;

.field final synthetic zzc:J

.field final synthetic zzd:Lcom/google/android/recaptcha/internal/zzxn;

.field private synthetic zze:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzg;JLcom/google/android/recaptcha/internal/zzxn;Lc10;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzd;->zzb:Lcom/google/android/recaptcha/internal/zzg;

    .line 2
    .line 3
    iput-wide p2, p0, Lcom/google/android/recaptcha/internal/zzd;->zzc:J

    .line 4
    .line 5
    iput-object p4, p0, Lcom/google/android/recaptcha/internal/zzd;->zzd:Lcom/google/android/recaptcha/internal/zzxn;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p5}, Ltj2;-><init>(ILc10;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lc10;)Lc10;
    .locals 6

    .line 1
    new-instance v0, Lcom/google/android/recaptcha/internal/zzd;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzd;->zzb:Lcom/google/android/recaptcha/internal/zzg;

    .line 4
    .line 5
    iget-wide v2, p0, Lcom/google/android/recaptcha/internal/zzd;->zzc:J

    .line 6
    .line 7
    iget-object v4, p0, Lcom/google/android/recaptcha/internal/zzd;->zzd:Lcom/google/android/recaptcha/internal/zzxn;

    .line 8
    .line 9
    move-object v5, p2

    .line 10
    invoke-direct/range {v0 .. v5}, Lcom/google/android/recaptcha/internal/zzd;-><init>(Lcom/google/android/recaptcha/internal/zzg;JLcom/google/android/recaptcha/internal/zzxn;Lc10;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, v0, Lcom/google/android/recaptcha/internal/zzd;->zze:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/recaptcha/internal/zzgr;

    .line 2
    .line 3
    check-cast p2, Lc10;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/google/android/recaptcha/internal/zzd;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcom/google/android/recaptcha/internal/zzd;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/google/android/recaptcha/internal/zzd;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object v0, Lz10;->a:Lz10;

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/recaptcha/internal/zzd;->zza:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    if-eq v1, v3, :cond_1

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto :goto_2

    .line 17
    :cond_0
    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzd;->zze:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Lcom/google/android/recaptcha/internal/zzcg;

    .line 20
    .line 21
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto :goto_4

    .line 25
    :cond_1
    :try_start_0
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catch_0
    move-exception p1

    .line 30
    goto :goto_1

    .line 31
    :cond_2
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzd;->zze:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, Lcom/google/android/recaptcha/internal/zzgr;

    .line 37
    .line 38
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzd;->zzb:Lcom/google/android/recaptcha/internal/zzg;

    .line 39
    .line 40
    invoke-virtual {v1}, Lcom/google/android/recaptcha/internal/zzg;->zzi()Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_3

    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0

    .line 49
    :cond_3
    :try_start_1
    iget-wide v4, p0, Lcom/google/android/recaptcha/internal/zzd;->zzc:J

    .line 50
    .line 51
    new-instance v6, Lcom/google/android/recaptcha/internal/zzc;

    .line 52
    .line 53
    iget-object v7, p0, Lcom/google/android/recaptcha/internal/zzd;->zzd:Lcom/google/android/recaptcha/internal/zzxn;

    .line 54
    .line 55
    const/4 v8, 0x0

    .line 56
    invoke-direct {v6, p1, v1, v7, v8}, Lcom/google/android/recaptcha/internal/zzc;-><init>(Lcom/google/android/recaptcha/internal/zzgr;Lcom/google/android/recaptcha/internal/zzg;Lcom/google/android/recaptcha/internal/zzxn;Lc10;)V

    .line 57
    .line 58
    .line 59
    iput v3, p0, Lcom/google/android/recaptcha/internal/zzd;->zza:I

    .line 60
    .line 61
    invoke-static {v4, v5, v6, p0}, Lqj3;->Q(JLkotlin/jvm/functions/Function2;Lc10;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-eq p1, v0, :cond_5

    .line 66
    .line 67
    :goto_0
    check-cast p1, Lo42;

    .line 68
    .line 69
    iget-object p1, p1, Lo42;->a:Ljava/lang/Object;

    .line 70
    .line 71
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzd;->zzb:Lcom/google/android/recaptcha/internal/zzg;

    .line 75
    .line 76
    invoke-static {p1, v3}, Lcom/google/android/recaptcha/internal/zzg;->zzg(Lcom/google/android/recaptcha/internal/zzg;Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 77
    .line 78
    .line 79
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    return-object p0

    .line 82
    :goto_1
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzd;->zzb:Lcom/google/android/recaptcha/internal/zzg;

    .line 83
    .line 84
    const/4 v3, 0x0

    .line 85
    invoke-static {v1, v3}, Lcom/google/android/recaptcha/internal/zzg;->zzg(Lcom/google/android/recaptcha/internal/zzg;Z)V

    .line 86
    .line 87
    .line 88
    iput v2, p0, Lcom/google/android/recaptcha/internal/zzd;->zza:I

    .line 89
    .line 90
    invoke-virtual {v1, p1, p0}, Lcom/google/android/recaptcha/internal/zzg;->zzf(Ljava/lang/Exception;Lc10;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    if-ne p1, v0, :cond_4

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_4
    :goto_2
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzd;->zzb:Lcom/google/android/recaptcha/internal/zzg;

    .line 98
    .line 99
    check-cast p1, Lcom/google/android/recaptcha/internal/zzcg;

    .line 100
    .line 101
    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzd;->zze:Ljava/lang/Object;

    .line 102
    .line 103
    const/4 v2, 0x3

    .line 104
    iput v2, p0, Lcom/google/android/recaptcha/internal/zzd;->zza:I

    .line 105
    .line 106
    invoke-virtual {v1, p1, p0}, Lcom/google/android/recaptcha/internal/zzg;->zzc(Lcom/google/android/recaptcha/internal/zzcg;Lc10;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    if-ne p0, v0, :cond_6

    .line 111
    .line 112
    :cond_5
    :goto_3
    return-object v0

    .line 113
    :cond_6
    move-object p0, p1

    .line 114
    :goto_4
    throw p0
.end method
