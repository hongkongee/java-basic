package song;

import java.io.Serializable;
import java.util.Set;

// 세이브 파일로 뽑을거면 Serializable 인터페이스 구현
public class Artist implements Serializable {
    private String name; // 가수명
    private Set<String> songList; // 노래 목록

    public Artist(String name, Set<String> songList) {
        this.name = name;
        this.songList = songList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getSongList() {
        return songList;
    }

    public void setSongList(Set<String> songList) {
        this.songList = songList;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", songList=" + songList +
                '}';
    }
}
