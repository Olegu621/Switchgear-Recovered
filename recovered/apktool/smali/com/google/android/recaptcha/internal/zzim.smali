.class final Lcom/google/android/recaptcha/internal/zzim;
.super Ltj2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# static fields
.field public static final synthetic zze:I


# instance fields
.field zza:I

.field final synthetic zzb:Lcom/google/android/recaptcha/internal/zziz;

.field final synthetic zzc:Ljava/util/List;

.field final synthetic zzd:Lcom/google/android/recaptcha/internal/zzip;

.field private synthetic zzf:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zziz;Ljava/util/List;Lcom/google/android/recaptcha/internal/zzip;Lc10;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzim;->zzb:Lcom/google/android/recaptcha/internal/zziz;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzim;->zzc:Ljava/util/List;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/google/android/recaptcha/internal/zzim;->zzd:Lcom/google/android/recaptcha/internal/zzip;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Ltj2;-><init>(ILc10;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lc10;)Lc10;
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/recaptcha/internal/zzim;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzim;->zzb:Lcom/google/android/recaptcha/internal/zziz;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzim;->zzc:Ljava/util/List;

    .line 6
    .line 7
    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzim;->zzd:Lcom/google/android/recaptcha/internal/zzip;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, p0, p2}, Lcom/google/android/recaptcha/internal/zzim;-><init>(Lcom/google/android/recaptcha/internal/zziz;Ljava/util/List;Lcom/google/android/recaptcha/internal/zzip;Lc10;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Lcom/google/android/recaptcha/internal/zzim;->zzf:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lcom/google/android/recaptcha/internal/zzim;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcom/google/android/recaptcha/internal/zzim;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/google/android/recaptcha/internal/zzim;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v1, Lz10;->a:Lz10;

    .line 2
    .line 3
    iget v0, p0, Lcom/google/android/recaptcha/internal/zzim;->zza:I

    .line 4
    .line 5
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto :goto_2

    .line 11
    :cond_0
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzim;->zzf:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Ly10;

    .line 14
    .line 15
    :goto_0
    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzim;->zzb:Lcom/google/android/recaptcha/internal/zziz;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zziz;->zza()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-ltz v2, :cond_3

    .line 22
    .line 23
    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzim;->zzc:Ljava/util/List;

    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zziz;->zza()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-ge v3, v4, :cond_3

    .line 34
    .line 35
    invoke-interface {p1}, Ly10;->c()Lkotlin/coroutines/CoroutineContext;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    sget-object v4, Lxt0;->w:Lxt0;

    .line 40
    .line 41
    invoke-interface {v3, v4}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/f;)Lkotlin/coroutines/CoroutineContext$Element;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, Lh01;

    .line 46
    .line 47
    const/4 v4, 0x1

    .line 48
    if-eqz v3, :cond_1

    .line 49
    .line 50
    invoke-interface {v3}, Lh01;->isActive()Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    move v3, v4

    .line 56
    :goto_1
    if-eqz v3, :cond_3

    .line 57
    .line 58
    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zziz;->zza()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    check-cast v2, Lcom/google/android/recaptcha/internal/zzzu;

    .line 67
    .line 68
    :try_start_0
    iget-object v3, p0, Lcom/google/android/recaptcha/internal/zzim;->zzd:Lcom/google/android/recaptcha/internal/zzip;

    .line 69
    .line 70
    invoke-static {v3, v2, v0}, Lcom/google/android/recaptcha/internal/zzip;->zzf(Lcom/google/android/recaptcha/internal/zzip;Lcom/google/android/recaptcha/internal/zzzu;Lcom/google/android/recaptcha/internal/zziz;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :catch_0
    move-exception v0

    .line 75
    move-object p1, v0

    .line 76
    invoke-virtual {v2}, Lcom/google/android/recaptcha/internal/zzzu;->zzk()I

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2}, Lcom/google/android/recaptcha/internal/zzzu;->zzg()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    new-instance v3, Ljava/lang/Integer;

    .line 84
    .line 85
    invoke-direct {v3, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2}, Lcom/google/android/recaptcha/internal/zzzu;->zzj()Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzim;->zzd:Lcom/google/android/recaptcha/internal/zzip;

    .line 93
    .line 94
    new-instance v9, Lcom/google/android/recaptcha/internal/zzil;

    .line 95
    .line 96
    invoke-direct {v9, v0}, Lcom/google/android/recaptcha/internal/zzil;-><init>(Lcom/google/android/recaptcha/internal/zzip;)V

    .line 97
    .line 98
    .line 99
    const/16 v10, 0x1f

    .line 100
    .line 101
    const/4 v6, 0x0

    .line 102
    const/4 v7, 0x0

    .line 103
    const/4 v8, 0x0

    .line 104
    invoke-static/range {v5 .. v10}, Lkotlin/collections/CollectionsKt;->x(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzim;->zzb:Lcom/google/android/recaptcha/internal/zziz;

    .line 108
    .line 109
    iput v4, p0, Lcom/google/android/recaptcha/internal/zzim;->zza:I

    .line 110
    .line 111
    invoke-static {v0, p1, v2, p0}, Lcom/google/android/recaptcha/internal/zzip;->zzd(Lcom/google/android/recaptcha/internal/zzip;Ljava/lang/Exception;Lcom/google/android/recaptcha/internal/zziz;Lc10;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    if-ne p0, v1, :cond_2

    .line 116
    .line 117
    return-object v1

    .line 118
    :cond_2
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    return-object p0

    .line 121
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 122
    .line 123
    return-object p0
.end method
