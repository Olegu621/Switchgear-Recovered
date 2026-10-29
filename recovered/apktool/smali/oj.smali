.class public final Loj;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final Companion:Llj;


# instance fields
.field public final a:Lx80;

.field public final b:Lg80;

.field public final c:Lbj;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Llj;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Loj;->Companion:Llj;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lx80;Lg80;Lbj;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Loj;->a:Lx80;

    .line 14
    .line 15
    iput-object p2, p0, Loj;->b:Lg80;

    .line 16
    .line 17
    iput-object p3, p0, Loj;->c:Lbj;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;J)V
    .locals 9

    .line 1
    :try_start_0
    iget-object v0, p0, Loj;->c:Lbj;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lbj;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Loj;->b:Lg80;

    .line 7
    .line 8
    check-cast v0, Lpz2;

    .line 9
    .line 10
    iget-object v0, v0, Lpz2;->e:Lod2;

    .line 11
    .line 12
    sget-object v1, Lfh2;->a:[Lfh2;

    .line 13
    .line 14
    const-string v1, "session_timestamp"

    .line 15
    .line 16
    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v0, v1, v2}, Lod2;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :catchall_0
    new-instance v3, Lnj;

    .line 25
    .line 26
    const/4 v8, 0x0

    .line 27
    move-object v4, p0

    .line 28
    move-object v7, p1

    .line 29
    move-wide v5, p2

    .line 30
    invoke-direct/range {v3 .. v8}, Lnj;-><init>(Loj;JLjava/lang/String;Lc10;)V

    .line 31
    .line 32
    .line 33
    iget-object p0, v4, Loj;->a:Lx80;

    .line 34
    .line 35
    invoke-virtual {p0, v3}, Lx80;->b(Lkotlin/jvm/functions/Function2;)Lec;

    .line 36
    .line 37
    .line 38
    return-void
.end method
