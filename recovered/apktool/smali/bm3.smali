.class public final Lbm3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:J

.field public d:Z

.field public final e:Z

.field public final f:J


# direct methods
.method public constructor <init>(Ljava/lang/String;JLjava/lang/String;)V
    .locals 8

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-wide v3, p2

    move-object v2, p4

    .line 18
    invoke-direct/range {v0 .. v7}, Lbm3;-><init>(Ljava/lang/String;Ljava/lang/String;JZJ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JZJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbm3;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lbm3;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-wide p3, p0, Lbm3;->c:J

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput-boolean p1, p0, Lbm3;->d:Z

    .line 12
    .line 13
    iput-boolean p5, p0, Lbm3;->e:Z

    .line 14
    .line 15
    iput-wide p6, p0, Lbm3;->f:J

    .line 16
    .line 17
    return-void
.end method
