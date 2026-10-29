.class public abstract Lcom/quago/mobile/sdk/f1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final a:Lcom/quago/mobile/sdk/j0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lcom/quago/mobile/sdk/k0;->a:Ljava/util/Locale;

    .line 2
    .line 3
    new-instance v0, Lcom/quago/mobile/sdk/j0;

    .line 4
    .line 5
    const-string v1, "QueryManager"

    .line 6
    .line 7
    invoke-direct {v0, v1}, Lcom/quago/mobile/sdk/j0;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/quago/mobile/sdk/f1;->a:Lcom/quago/mobile/sdk/j0;

    .line 11
    .line 12
    return-void
.end method

.method public static a(Ljava/util/HashMap;Ljava/util/HashMap;Lcom/quago/mobile/sdk/x;Ljava/util/LinkedList;IZ)I
    .locals 4

    .line 1
    iget v0, p2, Lcom/quago/mobile/sdk/x;->i:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/quago/mobile/sdk/x;

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    if-eqz p5, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0, p2}, Lcom/quago/mobile/sdk/x;->b(Lcom/quago/mobile/sdk/j;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    :cond_0
    if-nez p5, :cond_2

    .line 24
    .line 25
    invoke-virtual {v0, p2}, Lcom/quago/mobile/sdk/x;->b(Lcom/quago/mobile/sdk/j;)Z

    .line 26
    .line 27
    .line 28
    move-result p5

    .line 29
    if-eqz p5, :cond_2

    .line 30
    .line 31
    iget-wide v0, v0, Lcom/quago/mobile/sdk/j;->a:J

    .line 32
    .line 33
    iget-wide v2, p2, Lcom/quago/mobile/sdk/j;->a:J

    .line 34
    .line 35
    cmp-long p5, v0, v2

    .line 36
    .line 37
    if-nez p5, :cond_2

    .line 38
    .line 39
    :cond_1
    iget p5, p2, Lcom/quago/mobile/sdk/x;->i:I

    .line 40
    .line 41
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object p5

    .line 45
    invoke-virtual {p1, p5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p5

    .line 49
    if-eqz p5, :cond_2

    .line 50
    .line 51
    iget p5, p2, Lcom/quago/mobile/sdk/x;->i:I

    .line 52
    .line 53
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object p5

    .line 57
    invoke-virtual {p1, p5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p5

    .line 61
    check-cast p5, Ljava/lang/Integer;

    .line 62
    .line 63
    if-eqz p5, :cond_2

    .line 64
    .line 65
    add-int/lit8 p4, p4, -0x1

    .line 66
    .line 67
    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    .line 68
    .line 69
    .line 70
    move-result p5

    .line 71
    const/4 v0, 0x0

    .line 72
    invoke-virtual {p3, p5, v0}, Ljava/util/LinkedList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    iget p5, p2, Lcom/quago/mobile/sdk/x;->i:I

    .line 76
    .line 77
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object p5

    .line 81
    invoke-virtual {p0, p5}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    iget p5, p2, Lcom/quago/mobile/sdk/x;->i:I

    .line 85
    .line 86
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object p5

    .line 90
    invoke-virtual {p1, p5}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    :cond_2
    iget p5, p2, Lcom/quago/mobile/sdk/x;->i:I

    .line 94
    .line 95
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object p5

    .line 99
    invoke-virtual {p0, p5, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    iget p0, p2, Lcom/quago/mobile/sdk/x;->i:I

    .line 103
    .line 104
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-virtual {p3}, Ljava/util/LinkedList;->size()I

    .line 109
    .line 110
    .line 111
    move-result p2

    .line 112
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    invoke-virtual {p1, p0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    return p4
.end method

.method public static a(Lcom/quago/mobile/sdk/k;JJI)J
    .locals 10

    .line 120
    iget v0, p0, Lcom/quago/mobile/sdk/k;->c:I

    const/4 v1, -0x1

    const-wide/16 v2, 0x0

    if-ne v0, v1, :cond_0

    return-wide v2

    .line 121
    :cond_0
    iget-object v1, p0, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast v1, [Lcom/quago/mobile/sdk/x;

    array-length v1, v1

    :goto_0
    if-lez v1, :cond_5

    .line 122
    iget-object v4, p0, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast v4, [Lcom/quago/mobile/sdk/x;

    aget-object v4, v4, v0

    monitor-enter v4

    .line 123
    :try_start_0
    iget-object v5, p0, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    move-object v6, v5

    check-cast v6, [Lcom/quago/mobile/sdk/x;

    aget-object v6, v6, v0

    iget-wide v6, v6, Lcom/quago/mobile/sdk/j;->a:J

    cmp-long v6, v6, p1

    const/4 v7, 0x1

    if-ltz v6, :cond_1

    move-object v6, v5

    check-cast v6, [Lcom/quago/mobile/sdk/x;

    aget-object v6, v6, v0

    iget-wide v8, v6, Lcom/quago/mobile/sdk/j;->a:J

    cmp-long v6, v8, p3

    if-gtz v6, :cond_1

    move v6, v7

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_1
    const/4 v6, 0x0

    .line 124
    :goto_1
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v6, :cond_2

    const-wide/16 v8, 0x1

    add-long/2addr v2, v8

    :cond_2
    int-to-long v8, p5

    cmp-long v4, v2, v8

    if-ltz v4, :cond_3

    return-wide v2

    :cond_3
    add-int/lit8 v0, v0, -0x1

    if-gez v0, :cond_4

    .line 125
    check-cast v5, [Lcom/quago/mobile/sdk/x;

    array-length v0, v5

    sub-int/2addr v0, v7

    :cond_4
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 126
    :goto_2
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0

    :cond_5
    return-wide v2
.end method

.method public static a(JLjava/util/List;)V
    .locals 8

    if-nez p2, :cond_0

    goto :goto_1

    .line 146
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 147
    instance-of v1, v0, [Ljava/lang/Object;

    if-nez v1, :cond_1

    goto :goto_0

    .line 148
    :cond_1
    check-cast v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 149
    aget-object v2, v0, v1

    check-cast v2, Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Long;->doubleValue()D

    move-result-wide v4

    sub-double/2addr v2, v4

    const-wide/16 v4, 0x0

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(DD)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    .line 150
    aget-object v2, v0, v1

    check-cast v2, Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Long;->doubleValue()D

    move-result-wide v6

    sub-double/2addr v2, v6

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(DD)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    aput-object v2, v0, v1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public static a(Lcom/quago/mobile/sdk/k;Ljava/util/List;JJI)V
    .locals 9

    if-eqz p0, :cond_6

    .line 127
    iget v0, p0, Lcom/quago/mobile/sdk/k;->c:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_6

    if-nez p1, :cond_0

    goto :goto_1

    .line 128
    :cond_0
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 129
    iget v1, p0, Lcom/quago/mobile/sdk/k;->c:I

    iget-object v2, p0, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast v2, [Lcom/quago/mobile/sdk/j;

    array-length v3, v2

    const/4 v4, 0x0

    .line 130
    aget-object v2, v2, v4

    invoke-virtual {v2}, Lcom/quago/mobile/sdk/j;->a()Lcom/quago/mobile/sdk/j;

    move-result-object v2

    const/4 v4, 0x0

    :goto_0
    if-lez v3, :cond_5

    .line 131
    iget-object v5, p0, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast v5, [Lcom/quago/mobile/sdk/j;

    aget-object v5, v5, v1

    monitor-enter v5

    .line 132
    :try_start_0
    iget-object v6, p0, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast v6, [Lcom/quago/mobile/sdk/j;

    aget-object v6, v6, v1

    invoke-virtual {v6, v2}, Lcom/quago/mobile/sdk/j;->a(Lcom/quago/mobile/sdk/j;)V

    .line 133
    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 134
    iget-wide v5, v2, Lcom/quago/mobile/sdk/j;->a:J

    const-wide/16 v7, 0x0

    cmp-long v7, v5, v7

    if-eqz v7, :cond_3

    cmp-long v7, v5, p2

    if-ltz v7, :cond_3

    cmp-long v5, v5, p4

    if-gtz v5, :cond_3

    if-eqz p6, :cond_1

    .line 135
    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v5

    if-ge v5, p6, :cond_3

    :cond_1
    if-eqz v4, :cond_2

    .line 136
    invoke-virtual {v4, v2}, Lcom/quago/mobile/sdk/j;->b(Lcom/quago/mobile/sdk/j;)Z

    move-result v5

    if-nez v5, :cond_3

    .line 137
    :cond_2
    invoke-virtual {v2}, Lcom/quago/mobile/sdk/j;->a()Lcom/quago/mobile/sdk/j;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v1, v1, -0x1

    if-gez v1, :cond_4

    .line 138
    iget-object v1, p0, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast v1, [Lcom/quago/mobile/sdk/j;

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    :cond_4
    add-int/lit8 v3, v3, -0x1

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 139
    :try_start_1
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0

    .line 140
    :cond_5
    invoke-static {v0, p1}, Lcom/quago/mobile/sdk/f1;->a(Ljava/util/LinkedList;Ljava/util/List;)V

    :cond_6
    :goto_1
    return-void
.end method

.method public static a(Ljava/util/LinkedList;Ljava/util/List;)V
    .locals 2

    .line 141
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 142
    invoke-virtual {p0}, Ljava/util/LinkedList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 143
    invoke-virtual {p0, v0}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/quago/mobile/sdk/j;

    if-eqz v1, :cond_0

    .line 144
    invoke-virtual {v1}, Lcom/quago/mobile/sdk/j;->b()[Ljava/lang/Double;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 145
    :cond_0
    invoke-virtual {p0, v0}, Ljava/util/LinkedList;->remove(I)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static b(Lcom/quago/mobile/sdk/k;JJI)Ljava/util/LinkedList;
    .locals 7

    .line 1
    new-instance v0, Ljava/util/LinkedList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lcom/quago/mobile/sdk/k;->c:I

    .line 7
    .line 8
    const/4 v2, -0x1

    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    iget-object v2, p0, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, [Lcom/quago/mobile/sdk/v;

    .line 15
    .line 16
    array-length v2, v2

    .line 17
    new-instance v3, Lcom/quago/mobile/sdk/v;

    .line 18
    .line 19
    invoke-direct {v3}, Lcom/quago/mobile/sdk/v;-><init>()V

    .line 20
    .line 21
    .line 22
    :goto_0
    if-lez v2, :cond_4

    .line 23
    .line 24
    iget-object v4, p0, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v4, [Lcom/quago/mobile/sdk/v;

    .line 27
    .line 28
    aget-object v4, v4, v1

    .line 29
    .line 30
    monitor-enter v4

    .line 31
    :try_start_0
    iget-object v5, p0, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v5, [Lcom/quago/mobile/sdk/v;

    .line 34
    .line 35
    aget-object v5, v5, v1

    .line 36
    .line 37
    invoke-virtual {v5, v3}, Lcom/quago/mobile/sdk/v;->a(Lcom/quago/mobile/sdk/j;)V

    .line 38
    .line 39
    .line 40
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    iget-wide v4, v3, Lcom/quago/mobile/sdk/j;->a:J

    .line 42
    .line 43
    cmp-long v6, v4, p1

    .line 44
    .line 45
    if-ltz v6, :cond_2

    .line 46
    .line 47
    cmp-long v4, v4, p3

    .line 48
    .line 49
    if-gtz v4, :cond_2

    .line 50
    .line 51
    if-eqz p5, :cond_1

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-ge v4, p5, :cond_2

    .line 58
    .line 59
    :cond_1
    new-instance v4, Lcom/quago/mobile/sdk/v;

    .line 60
    .line 61
    invoke-direct {v4}, Lcom/quago/mobile/sdk/v;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3, v4}, Lcom/quago/mobile/sdk/v;->a(Lcom/quago/mobile/sdk/j;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v4}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    :cond_2
    add-int/lit8 v1, v1, -0x1

    .line 71
    .line 72
    if-gez v1, :cond_3

    .line 73
    .line 74
    iget-object v1, p0, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v1, [Lcom/quago/mobile/sdk/v;

    .line 77
    .line 78
    array-length v1, v1

    .line 79
    add-int/lit8 v1, v1, -0x1

    .line 80
    .line 81
    :cond_3
    add-int/lit8 v2, v2, -0x1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :catchall_0
    move-exception p0

    .line 85
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 86
    throw p0

    .line 87
    :cond_4
    :goto_1
    return-object v0
.end method

.method public static b(JLjava/util/List;)V
    .locals 6

    if-nez p2, :cond_0

    goto :goto_1

    .line 88
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 89
    instance-of v1, v0, [Ljava/lang/Object;

    if-nez v1, :cond_1

    goto :goto_0

    .line 90
    :cond_1
    check-cast v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 91
    aget-object v2, v0, v1

    check-cast v2, Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Long;->doubleValue()D

    move-result-wide v4

    sub-double/2addr v2, v4

    const-wide/16 v4, 0x0

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(DD)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    aput-object v2, v0, v1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method
