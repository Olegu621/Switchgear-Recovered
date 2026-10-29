.class public final Laz1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final c:Laz1;


# instance fields
.field public final a:Lqc3;

.field public final b:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Laz1;

    .line 2
    .line 3
    invoke-direct {v0}, Laz1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Laz1;->c:Laz1;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Laz1;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    new-instance v0, Lqc3;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-direct {v0, v1}, Lqc3;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Laz1;->a:Lqc3;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Lh72;
    .locals 10

    .line 1
    const-string v0, "messageType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lez0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Laz1;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lh72;

    .line 13
    .line 14
    if-nez v1, :cond_b

    .line 15
    .line 16
    iget-object p0, p0, Laz1;->a:Lqc3;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    sget-object v1, Ll72;->a:Ljava/lang/Class;

    .line 22
    .line 23
    const-class v1, Lsq0;

    .line 24
    .line 25
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const/4 v3, 0x0

    .line 30
    if-nez v2, :cond_1

    .line 31
    .line 32
    sget-object v2, Ll72;->a:Ljava/lang/Class;

    .line 33
    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const-string p0, "Message classes must extend GeneratedMessageV3 or GeneratedMessageLite"

    .line 44
    .line 45
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v3

    .line 49
    :cond_1
    :goto_0
    iget-object p0, p0, Lqc3;->b:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p0, Llb1;

    .line 52
    .line 53
    invoke-virtual {p0, p1}, Llb1;->a(Ljava/lang/Class;)Ls02;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    iget p0, v4, Ls02;->d:I

    .line 58
    .line 59
    const/4 v2, 0x2

    .line 60
    and-int/2addr p0, v2

    .line 61
    const/4 v5, 0x1

    .line 62
    if-ne p0, v2, :cond_2

    .line 63
    .line 64
    move p0, v5

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    const/4 p0, 0x0

    .line 67
    :goto_1
    const-string v2, "Protobuf runtime is not correctly loaded."

    .line 68
    .line 69
    if-eqz p0, :cond_5

    .line 70
    .line 71
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    if-eqz p0, :cond_3

    .line 76
    .line 77
    sget-object p0, Ll72;->d:Ltx2;

    .line 78
    .line 79
    sget-object v1, Lhg0;->a:Lfg0;

    .line 80
    .line 81
    iget-object v2, v4, Ls02;->a:Lw;

    .line 82
    .line 83
    new-instance v3, Lsh1;

    .line 84
    .line 85
    invoke-direct {v3, p0, v1, v2}, Lsh1;-><init>(Ltx2;Lfg0;Lw;)V

    .line 86
    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_3
    sget-object p0, Ll72;->b:Ltx2;

    .line 90
    .line 91
    sget-object v1, Lhg0;->b:Lfg0;

    .line 92
    .line 93
    if-eqz v1, :cond_4

    .line 94
    .line 95
    iget-object v2, v4, Ls02;->a:Lw;

    .line 96
    .line 97
    new-instance v3, Lsh1;

    .line 98
    .line 99
    invoke-direct {v3, p0, v1, v2}, Lsh1;-><init>(Ltx2;Lfg0;Lw;)V

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_4
    invoke-static {v2}, Lf42;->l(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    return-object v3

    .line 107
    :cond_5
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    if-eqz p0, :cond_7

    .line 112
    .line 113
    iget p0, v4, Ls02;->d:I

    .line 114
    .line 115
    and-int/2addr p0, v5

    .line 116
    if-ne p0, v5, :cond_6

    .line 117
    .line 118
    sget-object v5, Lin1;->b:Lgn1;

    .line 119
    .line 120
    sget-object v6, Lc81;->b:Lb81;

    .line 121
    .line 122
    sget-object v7, Ll72;->d:Ltx2;

    .line 123
    .line 124
    sget-object v8, Lhg0;->a:Lfg0;

    .line 125
    .line 126
    sget-object v9, Ljc1;->b:Lhc1;

    .line 127
    .line 128
    invoke-static/range {v4 .. v9}, Lqh1;->A(Ls02;Lgn1;Lc81;Ltx2;Lfg0;Lhc1;)Lqh1;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    goto :goto_2

    .line 133
    :cond_6
    sget-object v5, Lin1;->b:Lgn1;

    .line 134
    .line 135
    sget-object v6, Lc81;->b:Lb81;

    .line 136
    .line 137
    sget-object v7, Ll72;->d:Ltx2;

    .line 138
    .line 139
    const/4 v8, 0x0

    .line 140
    sget-object v9, Ljc1;->b:Lhc1;

    .line 141
    .line 142
    invoke-static/range {v4 .. v9}, Lqh1;->A(Ls02;Lgn1;Lc81;Ltx2;Lfg0;Lhc1;)Lqh1;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    goto :goto_2

    .line 147
    :cond_7
    iget p0, v4, Ls02;->d:I

    .line 148
    .line 149
    and-int/2addr p0, v5

    .line 150
    if-ne p0, v5, :cond_9

    .line 151
    .line 152
    sget-object v5, Lin1;->a:Lgn1;

    .line 153
    .line 154
    sget-object v6, Lc81;->a:La81;

    .line 155
    .line 156
    sget-object v7, Ll72;->b:Ltx2;

    .line 157
    .line 158
    sget-object v8, Lhg0;->b:Lfg0;

    .line 159
    .line 160
    if-eqz v8, :cond_8

    .line 161
    .line 162
    sget-object v9, Ljc1;->a:Lhc1;

    .line 163
    .line 164
    invoke-static/range {v4 .. v9}, Lqh1;->A(Ls02;Lgn1;Lc81;Ltx2;Lfg0;Lhc1;)Lqh1;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    goto :goto_2

    .line 169
    :cond_8
    invoke-static {v2}, Lf42;->l(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    return-object v3

    .line 173
    :cond_9
    sget-object v5, Lin1;->a:Lgn1;

    .line 174
    .line 175
    sget-object v6, Lc81;->a:La81;

    .line 176
    .line 177
    sget-object v7, Ll72;->c:Ltx2;

    .line 178
    .line 179
    const/4 v8, 0x0

    .line 180
    sget-object v9, Ljc1;->a:Lhc1;

    .line 181
    .line 182
    invoke-static/range {v4 .. v9}, Lqh1;->A(Ls02;Lgn1;Lc81;Ltx2;Lfg0;Lhc1;)Lqh1;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    :goto_2
    invoke-virtual {v0, p1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    check-cast p0, Lh72;

    .line 191
    .line 192
    if-eqz p0, :cond_a

    .line 193
    .line 194
    return-object p0

    .line 195
    :cond_a
    return-object v3

    .line 196
    :cond_b
    return-object v1
.end method
