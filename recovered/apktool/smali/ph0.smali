.class public Lph0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Law;


# instance fields
.field public final a:Ljava/io/File;

.field public final b:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lph0;->a:Ljava/io/File;

    .line 5
    .line 6
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lph0;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    .line 14
    return-void
.end method

.method public static a(Lph0;Ld10;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p1, Loh0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Loh0;

    .line 7
    .line 8
    iget v1, v0, Loh0;->e:I

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
    iput v1, v0, Loh0;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Loh0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Loh0;-><init>(Lph0;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Loh0;->c:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Loh0;->e:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    const/4 v5, 0x0

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v4, :cond_2

    .line 37
    .line 38
    if-ne v2, v3, :cond_1

    .line 39
    .line 40
    iget-object p0, v0, Loh0;->a:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p0, Ljava/io/Closeable;

    .line 43
    .line 44
    :try_start_0
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    goto/16 :goto_5

    .line 48
    .line 49
    :catchall_0
    move-exception p1

    .line 50
    goto/16 :goto_6

    .line 51
    .line 52
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-object v5

    .line 58
    :cond_2
    iget-object p0, v0, Loh0;->b:Ljava/io/FileInputStream;

    .line 59
    .line 60
    iget-object v2, v0, Loh0;->a:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v2, Lph0;

    .line 63
    .line 64
    :try_start_1
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :catchall_1
    move-exception p1

    .line 69
    goto :goto_2

    .line 70
    :cond_3
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iget-object p1, p0, Lph0;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-nez p1, :cond_7

    .line 80
    .line 81
    :try_start_2
    new-instance p1, Ljava/io/FileInputStream;

    .line 82
    .line 83
    iget-object v2, p0, Lph0;->a:Ljava/io/File;

    .line 84
    .line 85
    invoke-direct {p1, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 86
    .line 87
    .line 88
    invoke-static {v2, p1}, Lio/sentry/config/a;->b(Ljava/io/File;Ljava/io/FileInputStream;)Ljava/io/FileInputStream;

    .line 89
    .line 90
    .line 91
    move-result-object p1
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_1

    .line 92
    :try_start_3
    iput-object p0, v0, Loh0;->a:Ljava/lang/Object;

    .line 93
    .line 94
    iput-object p1, v0, Loh0;->b:Ljava/io/FileInputStream;

    .line 95
    .line 96
    iput v4, v0, Loh0;->e:I

    .line 97
    .line 98
    invoke-static {p1}, Lxt0;->c(Ljava/io/FileInputStream;)Lvk1;

    .line 99
    .line 100
    .line 101
    move-result-object v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 102
    if-ne v2, v1, :cond_4

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_4
    move-object v7, v2

    .line 106
    move-object v2, p0

    .line 107
    move-object p0, p1

    .line 108
    move-object p1, v7

    .line 109
    :goto_1
    :try_start_4
    invoke-static {p0, v5}, Ljb1;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_4
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_0

    .line 110
    .line 111
    .line 112
    return-object p1

    .line 113
    :catch_0
    move-object p0, v2

    .line 114
    goto :goto_3

    .line 115
    :catchall_2
    move-exception v2

    .line 116
    move-object v7, v2

    .line 117
    move-object v2, p0

    .line 118
    move-object p0, p1

    .line 119
    move-object p1, v7

    .line 120
    :goto_2
    :try_start_5
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 121
    :catchall_3
    move-exception v6

    .line 122
    :try_start_6
    invoke-static {p0, p1}, Ljb1;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 123
    .line 124
    .line 125
    throw v6
    :try_end_6
    .catch Ljava/io/FileNotFoundException; {:try_start_6 .. :try_end_6} :catch_0

    .line 126
    :catch_1
    :goto_3
    iget-object p1, p0, Lph0;->a:Ljava/io/File;

    .line 127
    .line 128
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    if-eqz p1, :cond_6

    .line 133
    .line 134
    new-instance p1, Ljava/io/FileInputStream;

    .line 135
    .line 136
    iget-object p0, p0, Lph0;->a:Ljava/io/File;

    .line 137
    .line 138
    invoke-direct {p1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 139
    .line 140
    .line 141
    invoke-static {p0, p1}, Lio/sentry/config/a;->b(Ljava/io/File;Ljava/io/FileInputStream;)Ljava/io/FileInputStream;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    :try_start_7
    iput-object p0, v0, Loh0;->a:Ljava/lang/Object;

    .line 146
    .line 147
    iput-object v5, v0, Loh0;->b:Ljava/io/FileInputStream;

    .line 148
    .line 149
    iput v3, v0, Loh0;->e:I

    .line 150
    .line 151
    invoke-static {p0}, Lxt0;->c(Ljava/io/FileInputStream;)Lvk1;

    .line 152
    .line 153
    .line 154
    move-result-object p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 155
    if-ne p1, v1, :cond_5

    .line 156
    .line 157
    :goto_4
    return-object v1

    .line 158
    :cond_5
    :goto_5
    invoke-static {p0, v5}, Ljb1;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 159
    .line 160
    .line 161
    return-object p1

    .line 162
    :goto_6
    :try_start_8
    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 163
    :catchall_4
    move-exception v0

    .line 164
    invoke-static {p0, p1}, Ljb1;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 165
    .line 166
    .line 167
    throw v0

    .line 168
    :cond_6
    new-instance p0, Lvk1;

    .line 169
    .line 170
    invoke-direct {p0, v4}, Lvk1;-><init>(Z)V

    .line 171
    .line 172
    .line 173
    return-object p0

    .line 174
    :cond_7
    const-string p0, "This scope has already been closed."

    .line 175
    .line 176
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    return-object v5
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-object p0, p0, Lph0;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
