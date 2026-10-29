.class public final Lcom/quago/mobile/sdk/p0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Lcom/quago/mobile/sdk/d0;

.field public final b:Lcom/quago/mobile/sdk/d1;

.field public final c:Lcom/quago/mobile/sdk/z0;

.field public final d:Lcom/quago/mobile/sdk/h0;

.field public final e:Ljava/util/LinkedList;

.field public final f:Ljava/util/LinkedList;

.field public final g:Ljava/util/LinkedList;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/quago/mobile/sdk/d0;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/quago/mobile/sdk/d0;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/quago/mobile/sdk/p0;->a:Lcom/quago/mobile/sdk/d0;

    .line 10
    .line 11
    new-instance v0, Lcom/quago/mobile/sdk/d1;

    .line 12
    .line 13
    invoke-direct {v0}, Lcom/quago/mobile/sdk/d1;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/quago/mobile/sdk/p0;->b:Lcom/quago/mobile/sdk/d1;

    .line 17
    .line 18
    new-instance v0, Lcom/quago/mobile/sdk/z0;

    .line 19
    .line 20
    invoke-direct {v0, p1}, Lcom/quago/mobile/sdk/z0;-><init>(Landroid/content/Context;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/quago/mobile/sdk/p0;->c:Lcom/quago/mobile/sdk/z0;

    .line 24
    .line 25
    new-instance p1, Lcom/quago/mobile/sdk/h0;

    .line 26
    .line 27
    invoke-direct {p1}, Lcom/quago/mobile/sdk/h0;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lcom/quago/mobile/sdk/p0;->d:Lcom/quago/mobile/sdk/h0;

    .line 31
    .line 32
    new-instance p1, Ljava/util/LinkedList;

    .line 33
    .line 34
    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lcom/quago/mobile/sdk/p0;->e:Ljava/util/LinkedList;

    .line 38
    .line 39
    new-instance p1, Ljava/util/LinkedList;

    .line 40
    .line 41
    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lcom/quago/mobile/sdk/p0;->f:Ljava/util/LinkedList;

    .line 45
    .line 46
    new-instance p1, Ljava/util/LinkedList;

    .line 47
    .line 48
    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, Lcom/quago/mobile/sdk/p0;->g:Ljava/util/LinkedList;

    .line 52
    .line 53
    return-void
.end method

.method public constructor <init>(Lcom/quago/mobile/sdk/p0;Ljava/util/LinkedList;Ljava/util/LinkedList;Ljava/util/LinkedList;)V
    .locals 1

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iget-object v0, p1, Lcom/quago/mobile/sdk/p0;->a:Lcom/quago/mobile/sdk/d0;

    iput-object v0, p0, Lcom/quago/mobile/sdk/p0;->a:Lcom/quago/mobile/sdk/d0;

    .line 56
    iget-object v0, p1, Lcom/quago/mobile/sdk/p0;->b:Lcom/quago/mobile/sdk/d1;

    iput-object v0, p0, Lcom/quago/mobile/sdk/p0;->b:Lcom/quago/mobile/sdk/d1;

    .line 57
    iget-object v0, p1, Lcom/quago/mobile/sdk/p0;->c:Lcom/quago/mobile/sdk/z0;

    iput-object v0, p0, Lcom/quago/mobile/sdk/p0;->c:Lcom/quago/mobile/sdk/z0;

    .line 58
    iget-object p1, p1, Lcom/quago/mobile/sdk/p0;->d:Lcom/quago/mobile/sdk/h0;

    iput-object p1, p0, Lcom/quago/mobile/sdk/p0;->d:Lcom/quago/mobile/sdk/h0;

    .line 59
    iput-object p2, p0, Lcom/quago/mobile/sdk/p0;->e:Ljava/util/LinkedList;

    .line 60
    iput-object p3, p0, Lcom/quago/mobile/sdk/p0;->f:Ljava/util/LinkedList;

    .line 61
    iput-object p4, p0, Lcom/quago/mobile/sdk/p0;->g:Ljava/util/LinkedList;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "QuagoMetaInformation{build="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/quago/mobile/sdk/p0;->a:Lcom/quago/mobile/sdk/d0;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", version="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/quago/mobile/sdk/p0;->b:Lcom/quago/mobile/sdk/d1;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", security="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lcom/quago/mobile/sdk/p0;->c:Lcom/quago/mobile/sdk/z0;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", emulation="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, Lcom/quago/mobile/sdk/p0;->d:Lcom/quago/mobile/sdk/h0;

    .line 39
    .line 40
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const/16 p0, 0x7d

    .line 44
    .line 45
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method
