public class Dragon
{
    private int level;
    private String attack;


    // Write the constructor here!
    public Dragon(String _attack, int _level) {
        level = _level;
        attack = _attack;
    }


    // Put getters here
    public String getAttack() {
        return attack;
    }

    public int getLevel() {
        return level;
    }

    // Put other methods here
    public String melee() {
        String result = "";
        for(int i = 0; i < level; i++) {
            result += attack;
        }
        return result;
    }


    // String representation of the object
    public String toString()
    {
        return "Dragon is at level " + level + " and attacks with " + attack;
    }
}