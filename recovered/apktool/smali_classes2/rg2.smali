.class public final Lrg2;
.super Ln0;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lfk0;
.implements Lwo0;
.implements Lpg2;
.implements Lhk0;


# static fields
.field public static final synthetic e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic f:J


# instance fields
.field private volatile synthetic _state$volatile:Ljava/lang/Object;

.field public d:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, Lrg2;

    .line 2
    .line 3
    const-class v1, Ljava/lang/Object;

    .line 4
    .line 5
    const-string v2, "_state$volatile"

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sput-object v1, Lrg2;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 12
    .line 13
    sget-object v1, Lio/sentry/util/b;->a:Lsun/misc/Unsafe;

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v1, v0}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    sput-wide v0, Lrg2;->f:J

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lrg2;->_state$volatile:Ljava/lang/Object;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, Ljb1;->c:Lr4;

    .line 2
    .line 3
    sget-object v1, Lrg2;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v1, Lio/sentry/util/b;->a:Lsun/misc/Unsafe;

    .line 9
    .line 10
    sget-wide v2, Lrg2;->f:J

    .line 11
    .line 12
    invoke-virtual {v1, p0, v2, v3}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    if-ne p0, v0, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    :cond_0
    return-object p0
.end method

.method public final b(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Lrg2;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 3
    .line 4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    monitor-exit p0

    .line 18
    return v2

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto/16 :goto_5

    .line 21
    .line 22
    :cond_0
    :try_start_1
    invoke-static {v1, p2}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    const/4 v1, 0x1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    monitor-exit p0

    .line 30
    return v1

    .line 31
    :cond_1
    :try_start_2
    invoke-virtual {v0, p0, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget p1, p0, Lrg2;->d:I

    .line 35
    .line 36
    and-int/lit8 p2, p1, 0x1

    .line 37
    .line 38
    if-nez p2, :cond_b

    .line 39
    .line 40
    add-int/2addr p1, v1

    .line 41
    iput p1, p0, Lrg2;->d:I

    .line 42
    .line 43
    iget-object p2, p0, Ln0;->a:[Lsg2;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 44
    .line 45
    monitor-exit p0

    .line 46
    :goto_0
    if-eqz p2, :cond_9

    .line 47
    .line 48
    array-length v0, p2

    .line 49
    move v3, v2

    .line 50
    :goto_1
    if-ge v3, v0, :cond_9

    .line 51
    .line 52
    aget-object v4, p2, v3

    .line 53
    .line 54
    if-eqz v4, :cond_8

    .line 55
    .line 56
    iget-object v4, v4, Lsg2;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 57
    .line 58
    :goto_2
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    if-nez v5, :cond_2

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_2
    sget-object v6, Lb40;->d:Lr4;

    .line 66
    .line 67
    if-ne v5, v6, :cond_3

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_3
    sget-object v7, Lb40;->c:Lr4;

    .line 71
    .line 72
    if-ne v5, v7, :cond_6

    .line 73
    .line 74
    :cond_4
    invoke-virtual {v4, v5, v6}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    if-eqz v7, :cond_5

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_5
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    if-eq v7, v5, :cond_4

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_6
    invoke-virtual {v4, v5, v7}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    if-eqz v6, :cond_7

    .line 93
    .line 94
    check-cast v5, Ler;

    .line 95
    .line 96
    sget-object v4, Lo42;->b:Lm42;

    .line 97
    .line 98
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    invoke-virtual {v5, v4}, Ler;->resumeWith(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_7
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    if-eq v6, v5, :cond_6

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_8
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_9
    monitor-enter p0

    .line 115
    :try_start_3
    iget p2, p0, Lrg2;->d:I

    .line 116
    .line 117
    if-ne p2, p1, :cond_a

    .line 118
    .line 119
    add-int/2addr p1, v1

    .line 120
    iput p1, p0, Lrg2;->d:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 121
    .line 122
    monitor-exit p0

    .line 123
    return v1

    .line 124
    :catchall_1
    move-exception p1

    .line 125
    goto :goto_4

    .line 126
    :cond_a
    :try_start_4
    iget-object p1, p0, Ln0;->a:[Lsg2;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 127
    .line 128
    monitor-exit p0

    .line 129
    move v8, p2

    .line 130
    move-object p2, p1

    .line 131
    move p1, v8

    .line 132
    goto :goto_0

    .line 133
    :goto_4
    monitor-exit p0

    .line 134
    throw p1

    .line 135
    :cond_b
    add-int/lit8 p1, p1, 0x2

    .line 136
    .line 137
    :try_start_5
    iput p1, p0, Lrg2;->d:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 138
    .line 139
    monitor-exit p0

    .line 140
    return v1

    .line 141
    :goto_5
    monitor-exit p0

    .line 142
    throw p1
.end method

.method public final collect(Lhk0;Lc10;)Ljava/lang/Object;
    .locals 13

    .line 1
    instance-of v0, p2, Lqg2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lqg2;

    .line 7
    .line 8
    iget v1, v0, Lqg2;->v:I

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
    iput v1, v0, Lqg2;->v:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lqg2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lqg2;-><init>(Lrg2;Lc10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lqg2;->f:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Lqg2;->v:I

    .line 30
    .line 31
    const/4 v3, 0x3

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x0

    .line 34
    const/4 v6, 0x2

    .line 35
    const/4 v7, 0x1

    .line 36
    if-eqz v2, :cond_4

    .line 37
    .line 38
    if-eq v2, v7, :cond_3

    .line 39
    .line 40
    if-eq v2, v6, :cond_2

    .line 41
    .line 42
    if-ne v2, v3, :cond_1

    .line 43
    .line 44
    iget-object p0, v0, Lqg2;->e:Ljava/lang/Object;

    .line 45
    .line 46
    iget-object p1, v0, Lqg2;->d:Lh01;

    .line 47
    .line 48
    iget-object v2, v0, Lqg2;->c:Lsg2;

    .line 49
    .line 50
    iget-object v8, v0, Lqg2;->b:Lhk0;

    .line 51
    .line 52
    iget-object v9, v0, Lqg2;->a:Lrg2;

    .line 53
    .line 54
    :try_start_0
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    goto/16 :goto_4

    .line 58
    .line 59
    :catchall_0
    move-exception p0

    .line 60
    goto/16 :goto_b

    .line 61
    .line 62
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-object v4

    .line 68
    :cond_2
    iget-object p0, v0, Lqg2;->e:Ljava/lang/Object;

    .line 69
    .line 70
    iget-object p1, v0, Lqg2;->d:Lh01;

    .line 71
    .line 72
    iget-object v2, v0, Lqg2;->c:Lsg2;

    .line 73
    .line 74
    iget-object v8, v0, Lqg2;->b:Lhk0;

    .line 75
    .line 76
    iget-object v9, v0, Lqg2;->a:Lrg2;

    .line 77
    .line 78
    :try_start_1
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 79
    .line 80
    .line 81
    goto/16 :goto_7

    .line 82
    .line 83
    :cond_3
    iget-object v2, v0, Lqg2;->c:Lsg2;

    .line 84
    .line 85
    iget-object p1, v0, Lqg2;->b:Lhk0;

    .line 86
    .line 87
    iget-object p0, v0, Lqg2;->a:Lrg2;

    .line 88
    .line 89
    :try_start_2
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 90
    .line 91
    .line 92
    goto :goto_3

    .line 93
    :catchall_1
    move-exception p1

    .line 94
    move-object v9, p0

    .line 95
    move-object p0, p1

    .line 96
    goto/16 :goto_b

    .line 97
    .line 98
    :cond_4
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    monitor-enter p0

    .line 102
    :try_start_3
    iget-object p2, p0, Ln0;->a:[Lsg2;

    .line 103
    .line 104
    if-nez p2, :cond_5

    .line 105
    .line 106
    new-array p2, v6, [Lsg2;

    .line 107
    .line 108
    iput-object p2, p0, Ln0;->a:[Lsg2;

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :catchall_2
    move-exception p1

    .line 112
    goto/16 :goto_e

    .line 113
    .line 114
    :cond_5
    iget v2, p0, Ln0;->b:I

    .line 115
    .line 116
    array-length v8, p2

    .line 117
    if-lt v2, v8, :cond_6

    .line 118
    .line 119
    array-length v2, p2

    .line 120
    mul-int/2addr v2, v6

    .line 121
    invoke-static {p2, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    move-object v2, p2

    .line 126
    check-cast v2, [Lsg2;

    .line 127
    .line 128
    iput-object v2, p0, Ln0;->a:[Lsg2;

    .line 129
    .line 130
    check-cast p2, [Lsg2;

    .line 131
    .line 132
    :cond_6
    :goto_1
    iget v2, p0, Ln0;->c:I

    .line 133
    .line 134
    :goto_2
    aget-object v8, p2, v2

    .line 135
    .line 136
    if-nez v8, :cond_7

    .line 137
    .line 138
    new-instance v8, Lsg2;

    .line 139
    .line 140
    invoke-direct {v8}, Lsg2;-><init>()V

    .line 141
    .line 142
    .line 143
    aput-object v8, p2, v2

    .line 144
    .line 145
    :cond_7
    add-int/lit8 v2, v2, 0x1

    .line 146
    .line 147
    array-length v9, p2

    .line 148
    if-lt v2, v9, :cond_8

    .line 149
    .line 150
    move v2, v5

    .line 151
    :cond_8
    iget-object v9, v8, Lsg2;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 152
    .line 153
    invoke-virtual {v9}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v10

    .line 157
    if-eqz v10, :cond_9

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_9
    sget-object p2, Lb40;->c:Lr4;

    .line 161
    .line 162
    invoke-virtual {v9, p2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    iput v2, p0, Ln0;->c:I

    .line 166
    .line 167
    iget p2, p0, Ln0;->b:I

    .line 168
    .line 169
    add-int/2addr p2, v7

    .line 170
    iput p2, p0, Ln0;->b:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 171
    .line 172
    monitor-exit p0

    .line 173
    move-object v2, v8

    .line 174
    :goto_3
    :try_start_4
    invoke-interface {v0}, Lc10;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    sget-object v8, Lxt0;->w:Lxt0;

    .line 179
    .line 180
    invoke-interface {p2, v8}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/f;)Lkotlin/coroutines/CoroutineContext$Element;

    .line 181
    .line 182
    .line 183
    move-result-object p2

    .line 184
    check-cast p2, Lh01;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 185
    .line 186
    move-object v9, p0

    .line 187
    move-object v8, p1

    .line 188
    move-object p1, p2

    .line 189
    move-object p0, v4

    .line 190
    :cond_a
    :goto_4
    :try_start_5
    sget-object p2, Lrg2;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 191
    .line 192
    invoke-virtual {p2, v9}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p2

    .line 196
    if-eqz p1, :cond_c

    .line 197
    .line 198
    invoke-interface {p1}, Lh01;->isActive()Z

    .line 199
    .line 200
    .line 201
    move-result v10

    .line 202
    if-eqz v10, :cond_b

    .line 203
    .line 204
    goto :goto_5

    .line 205
    :cond_b
    invoke-interface {p1}, Lh01;->getCancellationException()Ljava/util/concurrent/CancellationException;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    throw p0

    .line 210
    :cond_c
    :goto_5
    if-eqz p0, :cond_d

    .line 211
    .line 212
    invoke-virtual {p0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v10

    .line 216
    if-nez v10, :cond_10

    .line 217
    .line 218
    :cond_d
    sget-object p0, Ljb1;->c:Lr4;

    .line 219
    .line 220
    if-ne p2, p0, :cond_e

    .line 221
    .line 222
    move-object p0, v4

    .line 223
    goto :goto_6

    .line 224
    :cond_e
    move-object p0, p2

    .line 225
    :goto_6
    iput-object v9, v0, Lqg2;->a:Lrg2;

    .line 226
    .line 227
    iput-object v8, v0, Lqg2;->b:Lhk0;

    .line 228
    .line 229
    iput-object v2, v0, Lqg2;->c:Lsg2;

    .line 230
    .line 231
    iput-object p1, v0, Lqg2;->d:Lh01;

    .line 232
    .line 233
    iput-object p2, v0, Lqg2;->e:Ljava/lang/Object;

    .line 234
    .line 235
    iput v6, v0, Lqg2;->v:I

    .line 236
    .line 237
    invoke-interface {v8, p0, v0}, Lhk0;->emit(Ljava/lang/Object;Lc10;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    if-ne p0, v1, :cond_f

    .line 242
    .line 243
    goto :goto_a

    .line 244
    :cond_f
    move-object p0, p2

    .line 245
    :cond_10
    :goto_7
    iget-object p2, v2, Lsg2;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 246
    .line 247
    sget-object v10, Lb40;->c:Lr4;

    .line 248
    .line 249
    invoke-virtual {p2, v10}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object p2

    .line 253
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    sget-object v11, Lb40;->d:Lr4;

    .line 257
    .line 258
    if-ne p2, v11, :cond_11

    .line 259
    .line 260
    goto :goto_4

    .line 261
    :cond_11
    iput-object v9, v0, Lqg2;->a:Lrg2;

    .line 262
    .line 263
    iput-object v8, v0, Lqg2;->b:Lhk0;

    .line 264
    .line 265
    iput-object v2, v0, Lqg2;->c:Lsg2;

    .line 266
    .line 267
    iput-object p1, v0, Lqg2;->d:Lh01;

    .line 268
    .line 269
    iput-object p0, v0, Lqg2;->e:Ljava/lang/Object;

    .line 270
    .line 271
    iput v3, v0, Lqg2;->v:I

    .line 272
    .line 273
    new-instance p2, Ler;

    .line 274
    .line 275
    invoke-static {v0}, Lmz0;->b(Lc10;)Lc10;

    .line 276
    .line 277
    .line 278
    move-result-object v11

    .line 279
    invoke-direct {p2, v7, v11}, Ler;-><init>(ILc10;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {p2}, Ler;->u()V

    .line 283
    .line 284
    .line 285
    iget-object v11, v2, Lsg2;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 286
    .line 287
    :cond_12
    invoke-virtual {v11, v10, p2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    move-result v12

    .line 291
    if-eqz v12, :cond_13

    .line 292
    .line 293
    goto :goto_8

    .line 294
    :cond_13
    invoke-virtual {v11}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v12

    .line 298
    if-eq v12, v10, :cond_12

    .line 299
    .line 300
    sget-object v10, Lo42;->b:Lm42;

    .line 301
    .line 302
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 303
    .line 304
    invoke-virtual {p2, v10}, Ler;->resumeWith(Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    :goto_8
    invoke-virtual {p2}, Ler;->s()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object p2

    .line 311
    sget-object v10, Lz10;->a:Lz10;

    .line 312
    .line 313
    if-ne p2, v10, :cond_14

    .line 314
    .line 315
    goto :goto_9

    .line 316
    :cond_14
    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 317
    .line 318
    :goto_9
    if-ne p2, v1, :cond_a

    .line 319
    .line 320
    :goto_a
    return-object v1

    .line 321
    :goto_b
    monitor-enter v9

    .line 322
    :try_start_6
    iget p1, v9, Ln0;->b:I

    .line 323
    .line 324
    add-int/lit8 p1, p1, -0x1

    .line 325
    .line 326
    iput p1, v9, Ln0;->b:I

    .line 327
    .line 328
    if-nez p1, :cond_15

    .line 329
    .line 330
    iput v5, v9, Ln0;->c:I

    .line 331
    .line 332
    goto :goto_c

    .line 333
    :catchall_3
    move-exception p0

    .line 334
    goto :goto_d

    .line 335
    :cond_15
    :goto_c
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    iget-object p1, v2, Lsg2;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 339
    .line 340
    invoke-virtual {p1, v4}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 341
    .line 342
    .line 343
    monitor-exit v9

    .line 344
    throw p0

    .line 345
    :goto_d
    monitor-exit v9

    .line 346
    throw p0

    .line 347
    :goto_e
    monitor-exit p0

    .line 348
    throw p1
.end method

.method public final emit(Ljava/lang/Object;Lc10;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Ljb1;->c:Lr4;

    .line 4
    .line 5
    :cond_0
    const/4 p2, 0x0

    .line 6
    invoke-virtual {p0, p2, p1}, Lrg2;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 10
    .line 11
    return-object p0
.end method
