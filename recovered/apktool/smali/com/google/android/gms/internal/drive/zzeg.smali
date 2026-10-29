.class final Lcom/google/android/gms/internal/drive/zzeg;
.super Lcom/google/android/gms/internal/drive/zzir;


# instance fields
.field private final zzgw:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/os/Looper;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/drive/zzir;-><init>(Landroid/os/Looper;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lcom/google/android/gms/internal/drive/zzeg;->zzgw:Landroid/content/Context;

    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(Landroid/os/Looper;Landroid/content/Context;Lcom/google/android/gms/internal/drive/zzef;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/drive/zzeg;-><init>(Landroid/os/Looper;Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_1

    .line 5
    .line 6
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzee;->zzai()Lmr0;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzeg;->zzgw:Landroid/content/Context;

    .line 11
    .line 12
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const/4 v0, 0x6

    .line 17
    iget-object v1, p1, Lmr0;->a:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_5

    .line 24
    .line 25
    iget-object p1, p1, Lmr0;->b:Ljava/lang/String;

    .line 26
    .line 27
    const-string v0, "Don\'t know how to handle this event in context %s"

    .line 28
    .line 29
    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    if-nez p1, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    :goto_0
    const-string p1, "EventCallback"

    .line 41
    .line 42
    invoke-static {p1, p0}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, Landroid/util/Pair;

    .line 49
    .line 50
    iget-object p1, p0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, Lej3;

    .line 53
    .line 54
    iget-object p0, p0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p0, Lcom/google/android/gms/drive/events/DriveEvent;

    .line 57
    .line 58
    invoke-interface {p0}, Lcom/google/android/gms/drive/events/DriveEvent;->getType()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eq v0, v1, :cond_a

    .line 63
    .line 64
    const/4 v1, 0x2

    .line 65
    const/4 v2, 0x0

    .line 66
    if-eq v0, v1, :cond_9

    .line 67
    .line 68
    const/4 v1, 0x3

    .line 69
    if-eq v0, v1, :cond_4

    .line 70
    .line 71
    const/4 v1, 0x4

    .line 72
    if-eq v0, v1, :cond_3

    .line 73
    .line 74
    const/16 v1, 0x8

    .line 75
    .line 76
    if-eq v0, v1, :cond_2

    .line 77
    .line 78
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzee;->zzai()Lmr0;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    const-string v0, "Unexpected event: %s"

    .line 83
    .line 84
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-virtual {p1, v0, p0}, Lmr0;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_2
    check-cast p0, Lcom/google/android/gms/drive/events/zzr;

    .line 93
    .line 94
    iget-object p0, p0, Lcom/google/android/gms/drive/events/zzr;->a:Lcom/google/android/gms/internal/drive/zzh;

    .line 95
    .line 96
    new-instance v0, Lcom/google/android/gms/internal/drive/zze;

    .line 97
    .line 98
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/drive/zze;-><init>(Lcom/google/android/gms/internal/drive/zzh;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_3
    check-cast p1, Lcom/google/android/gms/drive/events/DriveEventService;

    .line 109
    .line 110
    check-cast p0, Lcom/google/android/gms/drive/events/zzb;

    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    sget-object p1, Lcom/google/android/gms/drive/events/DriveEventService;->e:Lmr0;

    .line 116
    .line 117
    const-string v0, "Unhandled changes available event in %s: %s"

    .line 118
    .line 119
    filled-new-array {v2, p0}, [Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-virtual {p1, v0, p0}, Lmr0;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :cond_4
    if-nez p1, :cond_8

    .line 128
    .line 129
    check-cast p0, Lcom/google/android/gms/drive/events/zzo;

    .line 130
    .line 131
    iget-object p1, p0, Lcom/google/android/gms/drive/events/zzo;->a:Lcom/google/android/gms/common/data/DataHolder;

    .line 132
    .line 133
    if-nez p1, :cond_7

    .line 134
    .line 135
    iget-boolean p0, p0, Lcom/google/android/gms/drive/events/zzo;->b:Z

    .line 136
    .line 137
    if-nez p0, :cond_6

    .line 138
    .line 139
    :cond_5
    return-void

    .line 140
    :cond_6
    throw v2

    .line 141
    :cond_7
    new-instance p0, Lgi1;

    .line 142
    .line 143
    invoke-direct {p0, p1}, Lgi1;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    .line 144
    .line 145
    .line 146
    new-instance p1, Lcom/google/android/gms/internal/drive/zzeh;

    .line 147
    .line 148
    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/drive/zzeh;-><init>(Lgi1;)V

    .line 149
    .line 150
    .line 151
    throw v2

    .line 152
    :cond_8
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 153
    .line 154
    .line 155
    return-void

    .line 156
    :cond_9
    check-cast p1, Lcom/google/android/gms/drive/events/DriveEventService;

    .line 157
    .line 158
    check-cast p0, Lcom/google/android/gms/drive/events/CompletionEvent;

    .line 159
    .line 160
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    sget-object p1, Lcom/google/android/gms/drive/events/DriveEventService;->e:Lmr0;

    .line 164
    .line 165
    const-string v0, "Unhandled completion event in %s: %s"

    .line 166
    .line 167
    filled-new-array {v2, p0}, [Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    invoke-virtual {p1, v0, p0}, Lmr0;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    return-void

    .line 175
    :cond_a
    check-cast p1, Lss;

    .line 176
    .line 177
    check-cast p0, Lcom/google/android/gms/drive/events/ChangeEvent;

    .line 178
    .line 179
    invoke-interface {p1, p0}, Lss;->onChange(Lcom/google/android/gms/drive/events/ChangeEvent;)V

    .line 180
    .line 181
    .line 182
    return-void
.end method
