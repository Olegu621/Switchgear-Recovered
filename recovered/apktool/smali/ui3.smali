.class public final synthetic Lui3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lvi3;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lvi3;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Lui3;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lui3;->b:Lvi3;

    .line 4
    .line 5
    iput-object p2, p0, Lui3;->c:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lui3;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lui3;->c:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, Lui3;->b:Lvi3;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzn;

    .line 11
    .line 12
    new-instance v2, Lwe2;

    .line 13
    .line 14
    const/16 v3, 0x14

    .line 15
    .line 16
    invoke-direct {v2, v3, p0, v1}, Lwe2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    const-string p0, "internal.remoteConfig"

    .line 20
    .line 21
    invoke-direct {v0, p0, v2}, Lcom/google/android/gms/internal/measurement/zzn;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzo;)V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :pswitch_0
    iget-object v0, p0, Lqo3;->b:Lmp3;

    .line 26
    .line 27
    iget-object v0, v0, Lmp3;->c:Lae3;

    .line 28
    .line 29
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lae3;->D0(Ljava/lang/String;)Ldi3;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    new-instance v2, Ljava/util/HashMap;

    .line 37
    .line 38
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 39
    .line 40
    .line 41
    const-string v3, "platform"

    .line 42
    .line 43
    const-string v4, "android"

    .line 44
    .line 45
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    const-string v3, "package_name"

    .line 49
    .line 50
    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    iget-object p0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p0, Lij3;

    .line 56
    .line 57
    iget-object p0, p0, Lij3;->d:Lpd3;

    .line 58
    .line 59
    invoke-virtual {p0}, Lpd3;->E()V

    .line 60
    .line 61
    .line 62
    const-wide/32 v3, 0x1fbd0

    .line 63
    .line 64
    .line 65
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    const-string v1, "gmp_version"

    .line 70
    .line 71
    invoke-virtual {v2, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    if-eqz v0, :cond_1

    .line 75
    .line 76
    invoke-virtual {v0}, Ldi3;->N()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    if-eqz p0, :cond_0

    .line 81
    .line 82
    const-string v1, "app_version"

    .line 83
    .line 84
    invoke-virtual {v2, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    :cond_0
    invoke-virtual {v0}, Ldi3;->P()J

    .line 88
    .line 89
    .line 90
    move-result-wide v3

    .line 91
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    const-string v1, "app_version_int"

    .line 96
    .line 97
    invoke-virtual {v2, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Ldi3;->b()J

    .line 101
    .line 102
    .line 103
    move-result-wide v0

    .line 104
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    const-string v0, "dynamite_version"

    .line 109
    .line 110
    invoke-virtual {v2, v0, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    :cond_1
    return-object v2

    .line 114
    :pswitch_1
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzu;

    .line 115
    .line 116
    new-instance v2, Lui3;

    .line 117
    .line 118
    const/4 v3, 0x1

    .line 119
    invoke-direct {v2, p0, v1, v3}, Lui3;-><init>(Lvi3;Ljava/lang/String;I)V

    .line 120
    .line 121
    .line 122
    const-string p0, "internal.appMetadata"

    .line 123
    .line 124
    invoke-direct {v0, p0, v2}, Lcom/google/android/gms/internal/measurement/zzu;-><init>(Ljava/lang/String;Ljava/util/concurrent/Callable;)V

    .line 125
    .line 126
    .line 127
    return-object v0

    .line 128
    nop

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
