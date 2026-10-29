.class public abstract Lbl;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final a:Lft;

.field public static final b:I

.field public static final c:I

.field public static final d:Lr4;

.field public static final e:Lr4;

.field public static final f:Lr4;

.field public static final g:Lr4;

.field public static final h:Lr4;

.field public static final i:Lr4;

.field public static final j:Lr4;

.field public static final k:Lr4;

.field public static final l:Lr4;

.field public static final m:Lr4;

.field public static final n:Lr4;

.field public static final o:Lr4;

.field public static final p:Lr4;

.field public static final q:Lr4;

.field public static final r:Lr4;

.field public static final s:Lr4;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lft;

    .line 2
    .line 3
    const/4 v4, 0x0

    .line 4
    const/4 v5, 0x0

    .line 5
    const-wide/16 v1, -0x1

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct/range {v0 .. v5}, Lft;-><init>(JLft;Lzk;I)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lbl;->a:Lft;

    .line 12
    .line 13
    const/16 v0, 0x20

    .line 14
    .line 15
    const/16 v1, 0xc

    .line 16
    .line 17
    const-string v2, "kotlinx.coroutines.bufferedChannel.segmentSize"

    .line 18
    .line 19
    invoke-static {v0, v1, v2}, Lj13;->y(IILjava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    sput v0, Lbl;->b:I

    .line 24
    .line 25
    const-string v0, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations"

    .line 26
    .line 27
    const/16 v2, 0x2710

    .line 28
    .line 29
    invoke-static {v2, v1, v0}, Lj13;->y(IILjava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    sput v0, Lbl;->c:I

    .line 34
    .line 35
    new-instance v0, Lr4;

    .line 36
    .line 37
    const-string v1, "BUFFERED"

    .line 38
    .line 39
    const/16 v2, 0x8

    .line 40
    .line 41
    invoke-direct {v0, v1, v2}, Lr4;-><init>(Ljava/lang/String;I)V

    .line 42
    .line 43
    .line 44
    sput-object v0, Lbl;->d:Lr4;

    .line 45
    .line 46
    new-instance v0, Lr4;

    .line 47
    .line 48
    const-string v1, "SHOULD_BUFFER"

    .line 49
    .line 50
    invoke-direct {v0, v1, v2}, Lr4;-><init>(Ljava/lang/String;I)V

    .line 51
    .line 52
    .line 53
    sput-object v0, Lbl;->e:Lr4;

    .line 54
    .line 55
    new-instance v0, Lr4;

    .line 56
    .line 57
    const-string v1, "S_RESUMING_BY_RCV"

    .line 58
    .line 59
    invoke-direct {v0, v1, v2}, Lr4;-><init>(Ljava/lang/String;I)V

    .line 60
    .line 61
    .line 62
    sput-object v0, Lbl;->f:Lr4;

    .line 63
    .line 64
    new-instance v0, Lr4;

    .line 65
    .line 66
    const-string v1, "RESUMING_BY_EB"

    .line 67
    .line 68
    invoke-direct {v0, v1, v2}, Lr4;-><init>(Ljava/lang/String;I)V

    .line 69
    .line 70
    .line 71
    sput-object v0, Lbl;->g:Lr4;

    .line 72
    .line 73
    new-instance v0, Lr4;

    .line 74
    .line 75
    const-string v1, "POISONED"

    .line 76
    .line 77
    invoke-direct {v0, v1, v2}, Lr4;-><init>(Ljava/lang/String;I)V

    .line 78
    .line 79
    .line 80
    sput-object v0, Lbl;->h:Lr4;

    .line 81
    .line 82
    new-instance v0, Lr4;

    .line 83
    .line 84
    const-string v1, "DONE_RCV"

    .line 85
    .line 86
    invoke-direct {v0, v1, v2}, Lr4;-><init>(Ljava/lang/String;I)V

    .line 87
    .line 88
    .line 89
    sput-object v0, Lbl;->i:Lr4;

    .line 90
    .line 91
    new-instance v0, Lr4;

    .line 92
    .line 93
    const-string v1, "INTERRUPTED_SEND"

    .line 94
    .line 95
    invoke-direct {v0, v1, v2}, Lr4;-><init>(Ljava/lang/String;I)V

    .line 96
    .line 97
    .line 98
    sput-object v0, Lbl;->j:Lr4;

    .line 99
    .line 100
    new-instance v0, Lr4;

    .line 101
    .line 102
    const-string v1, "INTERRUPTED_RCV"

    .line 103
    .line 104
    invoke-direct {v0, v1, v2}, Lr4;-><init>(Ljava/lang/String;I)V

    .line 105
    .line 106
    .line 107
    sput-object v0, Lbl;->k:Lr4;

    .line 108
    .line 109
    new-instance v0, Lr4;

    .line 110
    .line 111
    const-string v1, "CHANNEL_CLOSED"

    .line 112
    .line 113
    invoke-direct {v0, v1, v2}, Lr4;-><init>(Ljava/lang/String;I)V

    .line 114
    .line 115
    .line 116
    sput-object v0, Lbl;->l:Lr4;

    .line 117
    .line 118
    new-instance v0, Lr4;

    .line 119
    .line 120
    const-string v1, "SUSPEND"

    .line 121
    .line 122
    invoke-direct {v0, v1, v2}, Lr4;-><init>(Ljava/lang/String;I)V

    .line 123
    .line 124
    .line 125
    sput-object v0, Lbl;->m:Lr4;

    .line 126
    .line 127
    new-instance v0, Lr4;

    .line 128
    .line 129
    const-string v1, "SUSPEND_NO_WAITER"

    .line 130
    .line 131
    invoke-direct {v0, v1, v2}, Lr4;-><init>(Ljava/lang/String;I)V

    .line 132
    .line 133
    .line 134
    sput-object v0, Lbl;->n:Lr4;

    .line 135
    .line 136
    new-instance v0, Lr4;

    .line 137
    .line 138
    const-string v1, "FAILED"

    .line 139
    .line 140
    invoke-direct {v0, v1, v2}, Lr4;-><init>(Ljava/lang/String;I)V

    .line 141
    .line 142
    .line 143
    sput-object v0, Lbl;->o:Lr4;

    .line 144
    .line 145
    new-instance v0, Lr4;

    .line 146
    .line 147
    const-string v1, "NO_RECEIVE_RESULT"

    .line 148
    .line 149
    invoke-direct {v0, v1, v2}, Lr4;-><init>(Ljava/lang/String;I)V

    .line 150
    .line 151
    .line 152
    sput-object v0, Lbl;->p:Lr4;

    .line 153
    .line 154
    new-instance v0, Lr4;

    .line 155
    .line 156
    const-string v1, "CLOSE_HANDLER_CLOSED"

    .line 157
    .line 158
    invoke-direct {v0, v1, v2}, Lr4;-><init>(Ljava/lang/String;I)V

    .line 159
    .line 160
    .line 161
    sput-object v0, Lbl;->q:Lr4;

    .line 162
    .line 163
    new-instance v0, Lr4;

    .line 164
    .line 165
    const-string v1, "CLOSE_HANDLER_INVOKED"

    .line 166
    .line 167
    invoke-direct {v0, v1, v2}, Lr4;-><init>(Ljava/lang/String;I)V

    .line 168
    .line 169
    .line 170
    sput-object v0, Lbl;->r:Lr4;

    .line 171
    .line 172
    new-instance v0, Lr4;

    .line 173
    .line 174
    const-string v1, "NO_CLOSE_CAUSE"

    .line 175
    .line 176
    invoke-direct {v0, v1, v2}, Lr4;-><init>(Ljava/lang/String;I)V

    .line 177
    .line 178
    .line 179
    sput-object v0, Lbl;->s:Lr4;

    .line 180
    .line 181
    return-void
.end method
