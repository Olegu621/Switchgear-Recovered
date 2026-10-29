.class public final Lyp3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final c:Lyp3;


# instance fields
.field public final a:Ld52;

.field public final b:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lyp3;

    .line 2
    .line 3
    invoke-direct {v0}, Lyp3;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyp3;->c:Lyp3;

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
    iput-object v0, p0, Lyp3;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    new-instance v0, Ld52;

    .line 12
    .line 13
    const/4 v1, 0x3

    .line 14
    invoke-direct {v0, v1}, Ld52;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lyp3;->a:Ld52;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Lbq3;
    .locals 6

    .line 1
    sget-object v0, Lso3;->a:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p1, :cond_c

    .line 5
    .line 6
    iget-object v1, p0, Lyp3;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    check-cast v2, Lbq3;

    .line 13
    .line 14
    if-nez v2, :cond_b

    .line 15
    .line 16
    iget-object p0, p0, Lyp3;->a:Ld52;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    sget-object v2, Lcq3;->a:Ljava/lang/Class;

    .line 22
    .line 23
    const-class v2, Leo3;

    .line 24
    .line 25
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-nez v3, :cond_1

    .line 30
    .line 31
    sget-object v3, Lcq3;->a:Ljava/lang/Class;

    .line 32
    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const-string p0, "Message classes must extend GeneratedMessage or GeneratedMessageLite"

    .line 43
    .line 44
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_1
    :goto_0
    iget-object p0, p0, Ld52;->a:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p0, Lip3;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, Lip3;->zzc(Ljava/lang/Class;)Laq3;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    iget v3, p0, Laq3;->d:I

    .line 57
    .line 58
    const/4 v4, 0x2

    .line 59
    and-int/2addr v3, v4

    .line 60
    const/4 v5, 0x1

    .line 61
    if-ne v3, v4, :cond_2

    .line 62
    .line 63
    move v3, v5

    .line 64
    goto :goto_1

    .line 65
    :cond_2
    const/4 v3, 0x0

    .line 66
    :goto_1
    const-string v4, "Protobuf runtime is not correctly loaded."

    .line 67
    .line 68
    if-eqz v3, :cond_5

    .line 69
    .line 70
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-eqz v2, :cond_3

    .line 75
    .line 76
    sget-object v0, Lcq3;->d:Lnq3;

    .line 77
    .line 78
    sget-object v2, Lsn3;->a:Lqn3;

    .line 79
    .line 80
    iget-object p0, p0, Laq3;->a:Ltm3;

    .line 81
    .line 82
    new-instance v3, Lvp3;

    .line 83
    .line 84
    invoke-direct {v3, v0, v2, p0}, Lvp3;-><init>(Lnq3;Lqn3;Ltm3;)V

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_3
    sget-object v2, Lcq3;->b:Lnq3;

    .line 89
    .line 90
    sget-object v3, Lsn3;->b:Lqn3;

    .line 91
    .line 92
    if-eqz v3, :cond_4

    .line 93
    .line 94
    iget-object p0, p0, Laq3;->a:Ltm3;

    .line 95
    .line 96
    new-instance v0, Lvp3;

    .line 97
    .line 98
    invoke-direct {v0, v2, v3, p0}, Lvp3;-><init>(Lnq3;Lqn3;Ltm3;)V

    .line 99
    .line 100
    .line 101
    move-object v3, v0

    .line 102
    goto :goto_2

    .line 103
    :cond_4
    invoke-static {v4}, Lf42;->l(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    return-object v0

    .line 107
    :cond_5
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    if-eqz v2, :cond_7

    .line 112
    .line 113
    iget v2, p0, Laq3;->d:I

    .line 114
    .line 115
    and-int/2addr v2, v5

    .line 116
    if-ne v2, v5, :cond_6

    .line 117
    .line 118
    sget v0, Lxp3;->a:I

    .line 119
    .line 120
    sget-object v0, Lep3;->b:Ldp3;

    .line 121
    .line 122
    sget-object v2, Lcq3;->d:Lnq3;

    .line 123
    .line 124
    sget-object v3, Lsn3;->a:Lqn3;

    .line 125
    .line 126
    sget v4, Lop3;->a:I

    .line 127
    .line 128
    invoke-static {p0, v0, v2, v3}, Ltp3;->u(Laq3;Lep3;Lnq3;Lqn3;)Ltp3;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    goto :goto_2

    .line 133
    :cond_6
    sget v2, Lxp3;->a:I

    .line 134
    .line 135
    sget-object v2, Lep3;->b:Ldp3;

    .line 136
    .line 137
    sget-object v3, Lcq3;->d:Lnq3;

    .line 138
    .line 139
    sget v4, Lop3;->a:I

    .line 140
    .line 141
    invoke-static {p0, v2, v3, v0}, Ltp3;->u(Laq3;Lep3;Lnq3;Lqn3;)Ltp3;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    goto :goto_2

    .line 146
    :cond_7
    iget v2, p0, Laq3;->d:I

    .line 147
    .line 148
    and-int/2addr v2, v5

    .line 149
    if-ne v2, v5, :cond_9

    .line 150
    .line 151
    sget v2, Lxp3;->a:I

    .line 152
    .line 153
    sget-object v2, Lep3;->a:Lcp3;

    .line 154
    .line 155
    sget-object v3, Lcq3;->b:Lnq3;

    .line 156
    .line 157
    sget-object v5, Lsn3;->b:Lqn3;

    .line 158
    .line 159
    if-eqz v5, :cond_8

    .line 160
    .line 161
    sget v0, Lop3;->a:I

    .line 162
    .line 163
    invoke-static {p0, v2, v3, v5}, Ltp3;->u(Laq3;Lep3;Lnq3;Lqn3;)Ltp3;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    goto :goto_2

    .line 168
    :cond_8
    invoke-static {v4}, Lf42;->l(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    return-object v0

    .line 172
    :cond_9
    sget v2, Lxp3;->a:I

    .line 173
    .line 174
    sget-object v2, Lep3;->a:Lcp3;

    .line 175
    .line 176
    sget-object v3, Lcq3;->c:Lnq3;

    .line 177
    .line 178
    sget v4, Lop3;->a:I

    .line 179
    .line 180
    invoke-static {p0, v2, v3, v0}, Ltp3;->u(Laq3;Lep3;Lnq3;Lqn3;)Ltp3;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    :goto_2
    invoke-virtual {v1, p1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    check-cast p0, Lbq3;

    .line 189
    .line 190
    if-nez p0, :cond_a

    .line 191
    .line 192
    return-object v3

    .line 193
    :cond_a
    return-object p0

    .line 194
    :cond_b
    return-object v2

    .line 195
    :cond_c
    const-string p0, "messageType"

    .line 196
    .line 197
    invoke-static {p0}, Ln4;->s(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    return-object v0
.end method
